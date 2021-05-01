package com.player.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService {

	@Autowired
	private PlayerRepository playerRepo;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return playerRepo.findByName(name);
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return playerRepo.findByAge(age);
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return playerRepo.findByTeamName(teamName);
	}

	@Override
	public Player getPlayerByContact(long contact) {
		// TODO Auto-generated method stub
		return playerRepo.findByContact(contact);
	}

}
