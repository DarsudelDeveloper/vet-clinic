package serenitylabs.tutorials.vetclinic.dominion;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() throws Exception{
        LocalDateTime birthday = LocalDateTime.now();
        
        Dog fido = Dog.called("Fido")
        		.ofBreed("Poodle")
        		.bornOn(birthday);
        
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());     
     
        System.out.println(fido.getName());
        System.out.println(fido.getBreed());
        System.out.println(fido.getDateOfBirth());
        
    }

	@Test
	public void it_should_have_an_optional_favourite_food() throws Exception {
		   LocalDateTime birthday = LocalDateTime.now();
	        
	        Dog fido = new Dog("Fido","Poodle",birthday,"pizza");
	        
	        Assert.assertEquals("pizza", fido.getFavouriteFood());
	        System.out.println(fido.getFavouriteFood());
	}
    
}
