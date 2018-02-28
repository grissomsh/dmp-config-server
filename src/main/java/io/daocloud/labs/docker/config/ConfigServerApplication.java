package io.daocloud.labs.docker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableConfigServer
@EnableSwagger2Doc
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
