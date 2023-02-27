package in.nit.entity;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class Coustomer implements CommandLineRunner{
	
	
	private int id;
	
	private String name;
	
	private String dept;
	private List<String> listaccess;
	private Map<String, Double> version;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public List<String> getListaccess() {
		return listaccess;
	}
	public void setListaccess(List<String> listaccess) {
		this.listaccess = listaccess;
	}
	
	public Map<String, Double> getVersion() {
		return version;
	}
	public void setVersion(Map<String, Double> version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "Coustomer [id=" + id + ", name=" + name + ", dept=" + dept + ", listaccess=" + listaccess + ", version="
				+ version + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	

}
