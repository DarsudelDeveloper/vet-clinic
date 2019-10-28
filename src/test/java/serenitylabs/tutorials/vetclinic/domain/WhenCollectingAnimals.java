package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

import org.junit.Test;

public class WhenCollectingAnimals {
	 @Test
	 public void a_list_of_animals_can_contain_cats_and_dogs() {
		 Dog fido = Dog.called("Fido").ofBreed("Laborador").andOfColour("Black");
		 Animal felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
		 
		 List<Animal> animals = new ArrayList<>();
		 
		 animals.add(fido);
		 animals.add(felix);
		 
		 assertThat(animals, hasItems(felix, fido));
	 }
	
}
