package com.dqj.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloSpring {

	public void hello() {
		System.out.println("---------------------------------");
		System.out.println("Hello spring-framework");
		System.out.println("---------------------------------");
	}
}
