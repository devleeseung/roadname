package com.address.roadname;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.address.roadname.mapper") // ← Mapper 위치
public class RoadnameApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoadnameApplication.class, args);
	}
}