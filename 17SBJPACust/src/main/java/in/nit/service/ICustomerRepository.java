package in.nit.service;

import java.util.List;

import in.nit.dto.CustomerDto;

public interface ICustomerRepository {

	public String saveCustomer(CustomerDto dto);
	public String saveAllCustomer(List<CustomerDto> listDto);
}
