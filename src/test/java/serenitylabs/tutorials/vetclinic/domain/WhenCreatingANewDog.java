package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import serenitylabs.tutorials.vetclinic.dominion.Dog;

public class WhenCreatingANewDog {

	private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2019, 07, 04);

	@Test
	public void a_new_dog_should_have_a_name_a_breed_a_colour_and_a_date_of_birth() {

		Dog fido = DogBreeder.aLargeDog()
				.called("Fido")
//				.ofBreed("Labrador")
				.ofColour("white")
				.bornOn(THE_FOURTH_OF_JULY);

		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("Labrador", fido.getBreed());
		Assert.assertEquals("white", fido.getColour());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());

		System.err.println(fido.getName());
		System.out.println(fido.getBreed());
		System.out.println(fido.getColour());
		System.out.println(fido.getDateOfBirth());
	}

	@Test
	public void a_dog_can_have_an_optional_favourite_food() {

		Dog fido = DogBreeder.aSmallDog()
				.called("Spot")
				.ofColour("Browm")
				.withFavouriteFood("pizza")
				.bornOn(THE_FOURTH_OF_JULY);
//	        		Dog("Fido","Poodle",THE_FOURTH_OF_JULY,"pizza","color");

		Assert.assertEquals("Spot", fido.getName());
		Assert.assertEquals("Poodle", fido.getBreed());
		Assert.assertEquals("Browm", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());

		System.err.println(fido.getName());
		System.out.println(fido.getBreed());
		System.out.println(fido.getColour());
		System.out.println(fido.getFavouriteFood());
		System.out.println(fido.getDateOfBirth());
	}

	@Test
	public void a_dog_can_have_an_optional_favourite_toy() {
		Dog fido = DogBreeder.aDog()
				.called("Fido")
				.ofBreed("San Bernardo")
				.ofColour("Yellow")
				.withFavouriteToy("bone")
				.bornOn(THE_FOURTH_OF_JULY);

		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("San Bernardo", fido.getBreed());
		Assert.assertEquals("Yellow", fido.getColour());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());

		System.err.println(fido.getName());
		System.out.println(fido.getBreed());
		System.out.println(fido.getColour());
		System.out.println(fido.getFavouriteToy());
		System.out.println(fido.getDateOfBirth());
	}

}
