package com.projetogamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetogamelist.dslist.dto.GameDTO;
import com.projetogamelist.dslist.dto.GameMinDTO;
import com.projetogamelist.dslist.entities.Game;
import com.projetogamelist.dslist.repositories.GameRepository;

@Service
public class GamesService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
