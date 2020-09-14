package com.asgstudios.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asgstudios.dsresearch.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
