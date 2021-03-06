package com.asgstudios.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asgstudios.dsresearch.entities.Genre;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
