package com.spring.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.support.WebExchangeBindException;

import javax.swing.*;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.spring.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(DiveInSpringBootApplication.class, args);
//		new SpringApplicationBuilder(DiveInSpringBootApplication.class)
////				.web(WebApplicationType.NONE)
//				.run(args);
	}

}
