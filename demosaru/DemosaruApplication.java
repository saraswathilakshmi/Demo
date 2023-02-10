package com.innojc.demosaru;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DemosaruApplication {

	public static void main(String[] args) {SpringApplication.run(DemosaruApplication.class, args); }
		
	
	
	@Scheduled(fixedDelay=3000)
	public void scheduledRun() {
			System.out.println("Current Time" + new Date());
			
}


}
