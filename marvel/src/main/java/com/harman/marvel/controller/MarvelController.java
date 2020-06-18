package com.harman.marvel.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harman.comparelist.CompareHeroes;
import com.harman.marvel.model.MarvelCharacter;
import com.harman.marvel.model.MarvelTeam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RestController
public class MarvelController {

        @GetMapping("/getMaxPower")
        List<MarvelCharacter>  getMaxPower() throws IOException {
            InputStream inAnti_heroes = this.getClass().getClassLoader().getResourceAsStream("Anti_heroes.json");
            InputStream inAvengers = this.getClass().getClassLoader().getResourceAsStream("Avengers.json");
            InputStream inMutant = this.getClass().getClassLoader().getResourceAsStream("Mutant.json");
            MarvelTeam AntiHeroes = new ObjectMapper().readValue(inAnti_heroes, MarvelTeam.class);
            MarvelTeam Avengers = new ObjectMapper().readValue(inAvengers, MarvelTeam.class);
            MarvelTeam Mutants = new ObjectMapper().readValue(inMutant, MarvelTeam.class);
            List<MarvelCharacter>  characters = new ArrayList<>();
            characters.addAll(AntiHeroes.getCharacter());
            characters.addAll(Avengers.getCharacter());
            characters.addAll(Mutants.getPlaces());
            
            

           // Collections.sort(characters , ( a, b)-> a.getMax_power() > b.getMax_power()?-1:1 );
            
            Collections.sort(characters,new CompareHeroes());

            System.out.println(characters.subList(0,15).size());

            return characters.subList(0,15);
    }



}
