package com.app.jdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.model.Player;

public class SpringJdbcMain {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbean.xml");
	Player player=new Player();
	player.setAge(54);
	player.setCity("Chennai");
	player.setName("Laxman ShivaRama Krishnan");
	
	PlayerDAO dao=(PlayerDAO) context.getBean("playerDAO");
	//System.out.println(dao.addPlayer(player));
	
	System.out.println(dao.getPlayerById(12));
	System.out.println(dao.getPlayerById(11));
	
	
	List<Player> playersList=dao.getAllPlayers();
	System.out.println("\n\nTotal "+playersList.size()+" no of players in DB printing their details : ");
	for(Player p:playersList) {
		System.out.println(p);
	}
	}

}
