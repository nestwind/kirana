package com.kirana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kirana.*")
public class KiranaStoreWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiranaStoreWsApplication.class, args);
	}

}
