package com.lyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class LyhApplication {

	@RequestMapping(value = "aa")
	public String getStrString(){
		return  "HELLO LYH !";
	}

	public static void main(String[] args) {
		SpringApplication.run(LyhApplication.class, args);
	}
}
