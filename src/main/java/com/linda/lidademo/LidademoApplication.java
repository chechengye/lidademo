package com.linda.lidademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.linda.lidademo.mapper")
public class LidademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LidademoApplication.class, args);
	}

}
