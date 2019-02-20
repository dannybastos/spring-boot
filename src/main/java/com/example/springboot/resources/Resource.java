package com.example.springboot.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dannybastos on 18/02/19.
 */
@RestController
public class Resource {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@GetMapping(path = "hello/{name}")
	public ResponseEntity<String> getSongById(@PathVariable("name") String name) {
		String result = String.format("hello, %s", name);
		log.info(result);
		return ResponseEntity.ok(result);
	}
}
