package com.asgstudios.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asgstudios.dsresearch.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
