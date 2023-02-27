package in.nit.module;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
	
	private String pid;
	private Double price;
	private List<String> model;
	private Map<String,String> modPrice;
	

}
