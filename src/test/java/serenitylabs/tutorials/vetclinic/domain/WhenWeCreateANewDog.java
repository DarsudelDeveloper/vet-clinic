package serenitylabs.tutorials.vetclinic.domain;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.startsWith;
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        System.out.println(fido.toString());
        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
    }
    
    @Test
    public void a_dog_should_be_printed_in_a_readable_form() {
    	Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("White");
    	System.out.println(fido.toString());
    	assertThat(fido.toString(), is(equalToIgnoringCase("FidO the White Labrador")));

    	assertThat(fido.toString(), startsWith("Fido"));
    	assertThat(fido.toString(), endsWith("labrador"));
    	assertThat(fido.toString(), containsString("white"));    	
    }
    
    @Test
    public void a_dog_can_have_several_colours() {
    	Dog fido = Dog.called("Fido")
    			.ofBreed("Labrador")
    			.andOfColour("Green","Blue");
    	System.err.println(fido.toString());
    	System.err.println(fido.getColour().get(0));
    	assertThat(fido.getColour(), contains("Green","Blue"));
    	assertThat(fido.getColour(), hasItem("Green"));
    	assertThat(fido.getColour(), not(hasItem("Red")));
    }
    
}
