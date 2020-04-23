package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DemoApplication {
//exclude= {DataSourceAutoConfiguration.class}
	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);
		}catch (Exception o){
			o.printStackTrace();
		}

	}

}
