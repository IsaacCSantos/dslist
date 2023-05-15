package com.projetogamelist.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetogamelist.dslist.dto.GameMinDTO;
import com.projetogamelist.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GamesService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
