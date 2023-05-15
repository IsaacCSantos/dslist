package com.projetogamelist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogamelist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
