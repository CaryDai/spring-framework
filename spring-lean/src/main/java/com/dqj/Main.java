package com.dqj;

import com.dqj.config.HelloConfig;
import com.dqj.dao.HelloSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloSpring bean = context.getBean(HelloSpring.class);
		bean.hello();
	}
}
