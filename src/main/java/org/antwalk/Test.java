package org.antwalk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer cust=context.getBean(Customer.class);
		cust.display();
		Account saving=context.getBean("saving",Account.class);
		Account current=context.getBean("current",Account.class);
		System.out.println(saving.showAccont());
		System.out.println(current.showAccont());
	}

}
