package com.example.datadiri.service.impl;

import com.example.datadiri.entity.DatadiriEntity;
import com.example.datadiri.repository.DatadiriRepository;
import com.example.datadiri.service.DatadiriService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatadiriServiceImpl implements DatadiriService {

    private final DatadiriRepository datadiriRepository;

    public DatadiriServiceImpl(DatadiriRepository datadiriRepository){
        this.datadiriRepository = datadiriRepository;
    }
    @Override
    public List<DatadiriEntity> findAllDatadiri() {
        return datadiriRepository.findAll();
    }

    @Override
    public Optional<DatadiriEntity> findById(Long id) {
        return datadiriRepository.findById(id);
    }

    @Override
    public DatadiriEntity saveDatadiri(DatadiriEntity datadiriEntity) {
        return datadiriRepository.save(datadiriEntity);
    }

    @Override
    public DatadiriEntity updateDatadiri(DatadiriEntity datadiriEntity) {
        return datadiriRepository.save(datadiriEntity);
    }

    @Override
    public void deleteDatadiri(Long id) {
        datadiriRepository.deleteById(id);
    }
}
