package serenitylabs.tutorials.vetclinic.dominion;

import java.time.LocalDateTime;

public class Dog {

    private final String name,breed;
	private final LocalDateTime dateOfBirth;
	private final String favouriteFood;
	
   	public Dog(String name, String breed, LocalDateTime dateOfBirth) {
		this(name, breed, dateOfBirth, null);
//   		this.name = name;
//		this.breed = breed;
//		this.dateOfBirth = dateOfBirth;
//		this.favouriteFood =null;
	}

	public Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
		this.name = name;
		this.breed = breed;		
		this.dateOfBirth = dateOfBirth;
		this.favouriteFood = favouriteFood;
	}


	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}


	public String getFavouriteFood() {
		return favouriteFood;
	}

	public static DogBuilder called(String name) {
		return new DogBuilder(name);
	}
	
	public static class DogBuilder{
		private String name, breed;
//		private LocalDateTime birthday;
		
		public DogBuilder(String name) {
			this.name = name;
		}

		public DogBuilder ofBreed(String breed) {
			this.breed = breed;
			return this;
		}
		
		public Dog bornOn(LocalDateTime birthday) {
			return new Dog(name, breed, birthday);
		}
	}

}