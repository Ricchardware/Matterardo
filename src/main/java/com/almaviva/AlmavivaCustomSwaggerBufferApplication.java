package com.almaviva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@SpringBootApplication
@EnableSwagger2
public class AlmavivaCustomSwaggerBufferApplication {

	public static void main(String[] args) {

		SpringApplication.run(AlmavivaCustomSwaggerBufferApplication.class, args);
	}

}
