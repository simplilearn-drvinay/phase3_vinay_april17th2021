package com.app.jdbc.dao;

import java.util.List;

import com.app.jdbc.model.Player;

public interface PlayerDAO {

	public Player addPlayer(Player player);
	public Player getPlayerById(int id);
	public Player updatePlayer(Player player);
	public void deletePlayer(int id);
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByAge(int age);
	public List<Player> getPlayersByCity(String city);
	
}
