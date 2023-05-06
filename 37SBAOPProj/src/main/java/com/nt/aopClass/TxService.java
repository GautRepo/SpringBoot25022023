package com.nt.aopClass;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

	@Pointcut("execution(public String com.nt.dao.EmployeeDAO.getEmp())")
	public void p1() {}

	@Before("p1()")
	public void beginTnx() {
		System.out.println("Transection begined");
	}
	
	@After("p1()")
	public void commitTnx() {
		System.out.println("commit");
	}
	
	@AfterReturning("p1()")
	public void afterReturn() {
		System.out.println("After return");
	}

	@AfterThrowing("p1()")
	public void afterThrowiing() {
		System.out.println("After throwing");
	}
	
	@Around("p1()")
	public void aroundLog(ProceedingJoinPoint jp) {
		System.out.println("I'm from 1st Part of Loggging");
		try {
			Object obj=jp.proceed();
			System.out.println(obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("I'm from 2nd Part of Loggging");
		
	}
}
