package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

import serenitylabs.tutorials.vetclinic.dominion.Dog;


public class DogBreeder implements WithBreed, WithColour{
	public String name;
	public String breed;
	public String colour;
	public LocalDate dateOfBirth;
	public String favouriteFood;
	public String favouriteToy;
	
	public static DogBreeder aDog() {
		return new DogBreeder();		
	}
	
	public DogBreeder called(String name) {
		this.name = name;
		return this;		
	}

	public DogBreeder ofBreed(String breed) {
		this.breed = breed;
		return this;
	}
	
	public DogBreeder ofColour(String colour) {
		this.colour = colour;
		return this;
	}
	
	public Dog bornOn(LocalDate dateOfbirth) {
		return new Dog(name, breed, colour, favouriteFood, favouriteToy, dateOfbirth);
	}

	public DogBreeder withFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
		return this;
	}
	
	public DogBreeder withFavouriteToy(String favouriteToy) {
		this.favouriteToy = favouriteToy;
		return this;
		
	}

	public static DogBreeder aLargeDog() {
		return aDog().ofBreed("Labrador");
	}

	public static DogBreeder aSmallDog() {
		return aDog().ofBreed("Poodle");
	}
}