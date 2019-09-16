package serenitylabs.tutorials.vetclinic.model;

import java.util.HashMap;
import java.util.Map;

import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Meal;
import serenitylabs.tutorials.vetclinic.Pet;
import serenitylabs.tutorials.vetclinic.collections.katas.PetFood;

public class FoodDispenser {

	private static final Map<Breed, PetFood> BRAND_FOR_BREED = new HashMap<>();
	private static final Map<Breed, Integer> GRAMS_PER_KILO_BY_PET = new HashMap<>();
	static {
		BRAND_FOR_BREED.put(Breed.Cat, PetFood.KittyKat);
		BRAND_FOR_BREED.put(Breed.Dog, PetFood.FidosFood);

		GRAMS_PER_KILO_BY_PET.put(Breed.Dog, 20);
		GRAMS_PER_KILO_BY_PET.put(Breed.Cat, 10);
	}

	public Meal prepareMealFor(Pet pet) {
		return new Meal(rigthAmountOfFoodFor(pet), rightFoodFor(pet));
	}

	private PetFood rightFoodFor(Pet pet) {
		return BRAND_FOR_BREED.get(pet.getBreed());
	}

	private double rigthAmountOfFoodFor(Pet pet) {
		return pet.getWeightInKilos() * GRAMS_PER_KILO_BY_PET.get(pet.getBreed());
	}

}
//public void feed(Pet pet) {
//if (pet.getBreed() == Breed.Cat) {
//    feedCat(pet);
//} else if (pet.getBreed() == Breed.Dog) {
//    feedDog(pet);
//}
//}	
//private void feedDog(Pet pet) {
//pet.feed(20 * pet.getWeightInKilos(), PetFood.FidosFood);
//}
//private void feedCat(Pet pet) {
//pet.feed(10 * pet.getWeightInKilos(), PetFood.KittyKat);
//}
