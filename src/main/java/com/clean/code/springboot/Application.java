package com.clean.code.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//	@Scheduled(fixedRate = 1000L)
//	public void startRate(){
//		System.out.println("new rate" + new Date());
//	}
//	@Scheduled(initialDelay = 1000L, fixedDelay = 2000l)
//	public void startDelay(){
//		System.out.println("new startDelay" + new Date());
//
//	}
	@Scheduled(cron = "0 03 17 * * *")
	public void startCron(){
		System.out.println("new startCron" + new Date());
	}

}
