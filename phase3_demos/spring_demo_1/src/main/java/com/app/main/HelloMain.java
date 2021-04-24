package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Hello;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
//		Hello hello=context.getBean(Hello.class);
//		System.out.println(hello);

		Hello h1=(Hello) context.getBean("h1");
		System.out.println(h1);
		
		System.out.println("\n\nFetching h2 first time");
		Hello h2=(Hello) context.getBean("h2");
		System.out.println(h2);
		System.out.println("h2 -> "+System.identityHashCode(h2));
		System.out.println("\n\n\nFetching h2 again");
		Hello h21=(Hello) context.getBean("h2");
		System.out.println(h21);
		System.out.println("h21 -> "+System.identityHashCode(h21));
		System.out.println("Test message");
		
		
		Hello h3=(Hello) context.getBean("h3");
		System.out.println(h3);
	}

}
