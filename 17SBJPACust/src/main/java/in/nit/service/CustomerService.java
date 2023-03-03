package in.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dto.CustomerDto;
import in.nit.entity.Customer;
import in.nit.entity.CustomerRepo;

@Service("custService")
public class CustomerService implements ICustomerRepository{
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public String saveCustomer(CustomerDto dto) {
		Customer cust= new Customer();
		BeanUtils.copyProperties(dto, cust);
		cust = repo.save(cust); 
		
		return cust != null?"Object saved"+cust.getCno():"object not save";
	}

	@Override
	public String saveAllCustomer(List<CustomerDto> listDto) {
		List<Customer> listcust= new ArrayList();
		List<Customer> listcust1= null;
		listDto.forEach(dto->{
			Customer ct = new Customer();
			BeanUtils.copyProperties(dto, ct);
			listcust.add(ct);
		});
		listcust1= (List<Customer>) repo.saveAll(listcust);
		
		return listcust1 != null?"Batch insertion completed":"Batch insertion failed";
	}
	
	

}
