package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TestRunner implements CommandLineRunner {
	
	@Value("${my.app.name}")
	private String env;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
}
