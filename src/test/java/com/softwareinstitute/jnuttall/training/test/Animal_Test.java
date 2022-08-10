package com.softwareinstitute.jnuttall.training.test;

import com.softwareinstitute.jnuttall.training.Bat;
import com.softwareinstitute.jnuttall.training.Cat;
import com.softwareinstitute.jnuttall.training.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Animal_Test {
    @Test
    public void get_cat_name() {

        Cat cat = new Cat();

        assertEquals("Ginger", cat.getName(), "Was not the right name");
    }

}

 /*   @Test
    public void get_bat_flying(){

        Bat bat = new Bat();

        assertEquals("I'm flying!!", bat.flying());
    }

    @Test
    public void get_bird_layingEgg() {

        Penguin penguin = new Penguin();

        assertEquals("I'm laying an egg!!", penguin.getLayEgg());
    }

    @Test
    public void get_penguin_swimming() {

        Penguin penguin = new Penguin();

        assertEquals("I'm swimming!!", penguin.swim());
    }
}
*/