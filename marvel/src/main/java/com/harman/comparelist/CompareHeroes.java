package com.harman.comparelist;


import java.util.Comparator;

import com.harman.marvel.model.MarvelCharacter;

public class CompareHeroes implements Comparator<MarvelCharacter>{
	
	@Override
	public int compare(MarvelCharacter o1, MarvelCharacter o2) {
		
		   if(o1.getMax_power()>o2.getMax_power()) {
			   return -1;
		   }
		   else if(o1.getMax_power()<o2.getMax_power()) {
			   return 1;
		   }
		   else 
			   return 0;
	}
	
}
