package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BatchRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BatchRunner.run()-no number");

	}

}
