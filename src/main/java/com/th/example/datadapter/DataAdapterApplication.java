package com.th.example.datadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataAdapterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DataAdapterApplication.class, args);
	}
}
