package com.spring.tuto.controller;

import com.spring.tuto.entity.Tache;
import com.spring.tuto.repository.TacheRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TacheController {

    @Autowired
    TacheRepostory tacheRepostory;


    @PostMapping("createTache")
    public Tache createTache(@RequestBody Tache tache){
        return tacheRepostory.save(tache);
    }


    @GetMapping("getAllTaches")
    public List<Tache> getAllTaches(){
        return tacheRepostory.findAll();
    }
}
