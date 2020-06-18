package com.harman.marvel.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties()
public class MarvelTeam {
    @JsonProperty
    private String name;
    @JsonProperty
    private   List<MarvelCharacter> character;
    @JsonProperty
    private   List<MarvelCharacter> places;


    public List<MarvelCharacter> getPlaces() {
        return places;
    }

    public void setPlaces(List<MarvelCharacter> places) {
        this.places = places;
    }

   
  

    @Override
	public String toString() {
		return "MarvelTeam [name=" + name + ", character=" + character + ", places=" + places + "]";
	}

	public List<MarvelCharacter> getCharacter() {
        return character;
    }

    public void setCharacter(List<MarvelCharacter> character) {
        this.character = character;
    }


}
