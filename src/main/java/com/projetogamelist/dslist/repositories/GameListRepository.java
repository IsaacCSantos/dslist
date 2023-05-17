package com.projetogamelist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogamelist.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
