package com.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.model.Player;
import com.player.service.PlayerCrudService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="playercrud", description="This is a Player CRUD API Consumer, you can create, read player by ID, update all player details and delete player by ID")
public class PlayerCrudController {

	@Autowired
	private PlayerCrudService playerCrudService;
	
	@ApiOperation("You can create a Player by passing all the details apart from ID and ID will be autogenerated")
	@PostMapping("/player")
	public Player createPlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		return playerCrudService.createPlayer(player);
	}

	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		return playerCrudService.updatePlayer(player);
	}

	@GetMapping("/player/{id}")
	public Player getPlayerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return playerCrudService.getPlayerById(id);
	}

	@DeleteMapping("/player/{id}")
	public void deletePlayerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		playerCrudService.deletePlayerById(id);
	}

	
	
}