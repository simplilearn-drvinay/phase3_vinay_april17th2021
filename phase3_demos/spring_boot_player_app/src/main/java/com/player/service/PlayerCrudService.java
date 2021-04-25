package com.player.service;

import java.util.List;

import com.player.model.Player;

public interface PlayerCrudService {

	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayerById(int id);
	public void deletePlayerById(int id);
	
}
