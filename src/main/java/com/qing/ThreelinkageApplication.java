package com.qing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.qing.area.mapper"})
public class ThreelinkageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreelinkageApplication.class, args);
	}
}
