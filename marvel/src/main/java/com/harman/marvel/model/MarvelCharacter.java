package com.harman.marvel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties()
public class MarvelCharacter {
    @JsonProperty
    String name;
    @JsonProperty
    Integer max_power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMax_power() {
        return max_power;
    }

    public void setMax_power(Integer max_power) {
        this.max_power = max_power;
    }

	@Override
	public String toString() {
		return "MarvelCharacter [name=" + name + ", max_power=" + max_power + "]";
	}
    
 
}
