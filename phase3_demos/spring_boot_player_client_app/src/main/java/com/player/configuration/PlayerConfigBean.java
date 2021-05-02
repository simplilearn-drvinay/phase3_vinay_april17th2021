package com.player.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class PlayerConfigBean {

	@Bean
	public Docket getPlayerApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.player"))
//				.build();
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(info());
	}
	
	private ApiInfo info() {
		return new ApiInfo("Spring Boot Player REST API with H2", "Player with embedded H2 DB for an JPA for performing CRUD Operations", "1.0", "All Rights Reserved to SimpliLearn and Dr Vinay N I", "Dr Vinay N I", "Simplilearn License", "simplilearn.com");
		
	}
}
