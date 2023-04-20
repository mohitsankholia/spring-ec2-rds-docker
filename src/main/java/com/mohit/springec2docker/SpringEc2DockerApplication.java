package com.mohit.springec2docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Practice API", version = "2.0", description = "Spring-Ec2-RDS-Docker"))
public class SpringEc2DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEc2DockerApplication.class, args);
	}

}
