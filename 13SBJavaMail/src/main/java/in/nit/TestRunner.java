package in.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import in.nit.service.DemoMailService;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private DemoMailService service;

	@Override
	public void run(String... args) throws Exception {
		FileSystemResource resource = new FileSystemResource("C:\\Users\\Gautam\\Desktop\\IMG_20151231_145400.jpg");
		boolean sent =service.sendMail("gautam.kr0352@gmail.com", null, null, "Welcome", "Sample file", resource);
		System.out.println(sent);
	}

}
