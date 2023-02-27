package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class InterfaceRunner implements CommandLineRunner,Ordered{

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("InterfaceRunner.run() -5");
		
	}

}
