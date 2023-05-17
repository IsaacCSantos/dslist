package com.projetogamelist.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogamelist.dslist.dto.GameDTO;
import com.projetogamelist.dslist.dto.GameMinDTO;
import com.projetogamelist.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GamesService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
