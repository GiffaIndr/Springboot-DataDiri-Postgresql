package com.example.datadiri.service;

import com.example.datadiri.entity.DatadiriEntity;

import java.util.List;
import java.util.Optional;

public interface DatadiriService {
    List<DatadiriEntity> findAllDatadiri();
    Optional<DatadiriEntity> findById(Long id);
    DatadiriEntity saveDatadiri(DatadiriEntity datadiriEntity);
    DatadiriEntity updateDatadiri(DatadiriEntity datadiriEntity);
    void deleteDatadiri(Long id);
}
