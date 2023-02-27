package in.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private AlterService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.showMsg();

	}

}
