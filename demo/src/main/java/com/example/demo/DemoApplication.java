package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("com.example.demo.inbound")//读取对应位置下所有的dao接口
public class DemoApplication {
//exclude= {DataSourceAutoConfiguration.class}
	public static void main(String[] args) {
		try {
			//我在输入中文
			SpringApplication.run(DemoApplication.class, args);
		}catch (Exception o){
			o.printStackTrace();
		}

	}

}
