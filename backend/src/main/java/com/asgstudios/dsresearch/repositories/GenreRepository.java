package com.asgstudios.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asgstudios.dsresearch.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
