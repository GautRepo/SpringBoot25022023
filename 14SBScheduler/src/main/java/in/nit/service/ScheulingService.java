package in.nit.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheulingService {

	@Scheduled(fixedDelay = 5000)
	public void getTime() {
		System.out.println("Time is: " + new Date());
	}
	
}
