package com.app.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.model.Player;
import com.app.service.PlayerService;

class PlayerServiceImplTest {

	private static PlayerService service;
	
	@BeforeAll
	public static void createPlayers() {
		service=new PlayerServiceImpl();
		List<Player> playerList=new ArrayList<>();
		playerList.add(new Player(100, "Sachin", 33));
		playerList.add(new Player(101, "Sara", 32));
		playerList.add(new Player(102, "Saurav", 33));
		playerList.add(new Player(103, "Rahul", 33));
		playerList.add(new Player(104, "Jay", 33));
		PlayerServiceImpl.playerList=playerList;
	}
	@Test
	void testGetPlayerByIdForValid() {
		int id=100;
		Player player=new Player(100, "Sachin", 33);
		Assertions.assertEquals(player, service.getPlayerById(id));
	}
	
	@Test
	void testGetPlayerByIdForInValid() {
		int id=10000;
		//Player player=new Player(100, "Sachin", 33);
		Assertions.assertEquals(null, service.getPlayerById(id));
	}

	@Test
	void testGetPlayersByAgeForMatchingAge() {
		int age=33;
		Assertions.assertEquals(4, service.getPlayersByAge(age).size());
	}
	
	@Test
	void testGetPlayersByAgeForNonMatchingAge() {
		int age=3333;
		Assertions.assertEquals(0, service.getPlayersByAge(age).size());
	}

}
