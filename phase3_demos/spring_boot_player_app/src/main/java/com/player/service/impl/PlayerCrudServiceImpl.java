package com.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerCrudService;

@Service
public class PlayerCrudServiceImpl implements PlayerCrudService {

	@Autowired
	private PlayerRepository playerRepo;
	
	@Override
	public Player createPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return  playerRepo.save(player);
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return  playerRepo.findById(id).get();
	}

	@Override
	public void deletePlayerById(int id) {
		// TODO Auto-generated method stub
		playerRepo.deleteById(id);
	}

}
