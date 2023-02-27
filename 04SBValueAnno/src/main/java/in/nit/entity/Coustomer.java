package in.nit.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Coustomer implements CommandLineRunner{
	
	@Value("${my.app.id}")
	private int id;
	@Value("${my.app.name}")
	private String name;
	@Value("${my.app.dept}")
	private String dept;
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
	@Override
	public String toString() {
		return "Coustomer [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	

}
