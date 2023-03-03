package in.nit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import in.nit.dto.CustomerDto;
import in.nit.service.CustomerService;
import in.nit.service.ICustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx= null;
		ctx =SpringApplication.run(Application.class, args);
		ICustomerRepository cust =ctx.getBean("custService",CustomerService.class);
		CustomerDto dto = new CustomerDto();
		dto.setCadd("Bangalore");
		dto.setCname("Surbhi");
		dto.setCbill(120.10);
		
		CustomerDto dto2 = new CustomerDto();
		dto2.setCadd("Bangalore");
		dto2.setCname("Jeevan");
		dto2.setCbill(120.10);
		List<CustomerDto> listDto = Arrays.asList(dto,dto2);
		try {
			System.out.println(cust.saveAllCustomer(listDto));
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		
		/*
		 * try { cust.saveCustomer(dto); }catch(Exception e) { e.printStackTrace(); }
		 */
		((ConfigurableApplicationContext) ctx).close();
	}

}
