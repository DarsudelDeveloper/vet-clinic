package serenitylabs.tutorials.vetclinic.dominion;

import java.time.LocalDate;

public class Dog {
	private final LocalDate dateOfBirth;
	private final String name, breed, colour, favouriteFood, favouriteToy;

   	//El metodo deberia ser private para usar el contructor con su respectiva interface
	public Dog(String name, String breed, String colour, String favouriteFood, String favouriteToy,LocalDate dateOfBirth) {
		this.name = name;
		this.breed = breed;		
		this.dateOfBirth = dateOfBirth;
		this.favouriteFood = favouriteFood;
		this.favouriteToy = favouriteToy;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getColour() {		
		return colour;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	


	public String getFavouriteFood() {
		return favouriteFood;
	}

	public String getFavouriteToy() {
		return favouriteToy;
	}
			
}