package com.projetogamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetogamelist.dslist.dto.GameListDTO;
import com.projetogamelist.dslist.entities.GameList;
import com.projetogamelist.dslist.repositories.GameListRepository;

@Service
public class GamesListService {
	
	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
