package com.example.datadiri.controller;

import com.example.datadiri.entity.DatadiriEntity;
import com.example.datadiri.service.DatadiriService;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/data-diri")
public class DatadiriController {
    private final DatadiriService datadiriService;

    public DatadiriController(DatadiriService datadiriService){
        this.datadiriService = datadiriService;
    }

    @GetMapping
    public List<DatadiriEntity> findAllDatadiri(){
        return datadiriService.findAllDatadiri();
    }

    @GetMapping("{id}")
    public Optional<DatadiriEntity> findDatadiriById(@PathVariable("id") Long id){
        return datadiriService.findById(id);
    }

    @PostMapping
    public DatadiriEntity saveDatadiri(@RequestBody DatadiriEntity datadiriEntity){
        return datadiriService.saveDatadiri(datadiriEntity);
    }

    @PutMapping
    public DatadiriEntity updateDatadiri(@RequestBody DatadiriEntity datadiriEntity){
        return datadiriService.updateDatadiri(datadiriEntity);
    }

    @DeleteMapping
    public void deleteDatadiri(@PathVariable("id") Long id){
        datadiriService.deleteDatadiri(id);
    }
}
