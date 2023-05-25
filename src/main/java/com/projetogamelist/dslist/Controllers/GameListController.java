package com.projetogamelist.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogamelist.dslist.dto.GameListDTO;
import com.projetogamelist.dslist.dto.GameMinDTO;
import com.projetogamelist.dslist.dto.ReplacementDTO;
import com.projetogamelist.dslist.services.GamesListService;
import com.projetogamelist.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GamesListService gameListService;
	
	@Autowired
	private GamesService gamesService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gamesService.findByList(listId);
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
