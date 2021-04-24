package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.PlayerDAO;
import com.app.model.Player;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hibernate-beans.xml");
		PlayerDAO dao=(PlayerDAO)context.getBean("dao");
	//	Player p=new Player("Ab De Villiers", 37, "Bela-Bela");
		
		//System.out.println(dao.addPlayer(p));
		System.out.println(dao.getAllPlayers());
		
		System.out.println(dao.getPlayerById(3));
	}

}
