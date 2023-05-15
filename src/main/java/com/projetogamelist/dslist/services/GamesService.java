package com.projetogamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogamelist.dslist.dto.GameMinDTO;
import com.projetogamelist.dslist.entities.Game;
import com.projetogamelist.dslist.repositories.GameRepository;

@Service
public class GamesService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
