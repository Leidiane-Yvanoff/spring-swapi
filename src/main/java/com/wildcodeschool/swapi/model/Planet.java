package com.wildcodeschool.swapi.model;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {

    // TODO : add attributes
	private String name;
    private String population;
  
    
    
    // constructor
    public Planet() {
    	
    }
    
    
    //getters & setters

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

}
