package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Created by dannybastos on 27/03/19.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.springboot.resources"))
				.build()
				.apiInfo(myApiInfo());

	}
	private ApiInfo myApiInfo() {
		return new ApiInfo(
				"SpringBoot", "Spring Boot Basic app",
				"1.0",
				"",
				new Contact("Danny Bastos", "https://github.com/dannybastos", "danny.bastos.br@gmail.com"),
				"", "",  Collections.emptyList());
	}

}
