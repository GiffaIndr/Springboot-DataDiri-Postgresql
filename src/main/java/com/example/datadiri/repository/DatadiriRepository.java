package com.example.datadiri.repository;

import com.example.datadiri.entity.DatadiriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatadiriRepository extends JpaRepository<DatadiriEntity, Long> {

}
