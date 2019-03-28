package com.example.springboot.resources;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dto.HiResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by dannybastos on 18/02/19.
 */
@RestController
public class Resource {


	private ObjectMapper mapper;
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public Resource(ObjectMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@GetMapping(path = "hello/{name}")
	public ResponseEntity<String> sayHello(@PathVariable("name") String name) {
		String result = String.format("hello, %s", name);
		log.info(result);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(path = "hi")
	public ResponseEntity<HiResponseDTO> sayHi(HttpServletRequest req) throws JsonProcessingException {
		HiResponseDTO hiResponseDTO = new HiResponseDTO("Hi there!", req.getRemoteAddr(), req.getLocalAddr());
		log.info(mapper.writeValueAsString(hiResponseDTO));
		return ResponseEntity.ok(hiResponseDTO);
	}
	
}
