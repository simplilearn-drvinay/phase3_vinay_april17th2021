package com.player.service.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.player.model.Player;
import com.player.service.PlayerCrudService;

@Service
public class PlayerCrudServiceImpl implements PlayerCrudService {

	private String url="http://localhost:7000/player/";
	private RestTemplate template= new RestTemplate();
	
	@Override
	public Player createPlayer(Player player) {
		// TODO Auto-generated method stub
		return template.postForObject(url, player, Player.class);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		template.put(url, player);
		 return player;
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		ResponseEntity<Player> entity=template.exchange(url+id, HttpMethod.GET,null,Player.class);
		return  entity.getBody();
	}

	@Override
	public void deletePlayerById(int id) {
		// TODO Auto-generated method stub
		template.delete(url+id);
	}

}
