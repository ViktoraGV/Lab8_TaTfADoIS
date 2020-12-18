package net.codejava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

public class RestDomBuilderTest {
    RestDomBuilder restDomBuilder;

    @Before
    public void setUp() throws Exception {
       restDomBuilder = new RestDomBuilder("po.xml");
    }

    @Test
    public void getData() {
       List<Restaurant> expected = getRest();
        List<Restaurant> actual = restDomBuilder.getData();

        assertEquals(actual, expected);

    }

    public List<Restaurant> getRest(){

        List<Restaurant> expected = new ArrayList<>();
        Restaurant restaurant1 = new Restaurant(1, "Bistro", "Meat",5.0,"Bohdanovicha",3,"Italy");
        Restaurant restaurant2 = new Restaurant(2, "LA-LA-LA", "Potato",10.0,"Surganova",2,"French");
        Restaurant restaurant3 = new Restaurant(3, "Mom", "Borscht",15.0,"Ykuba Kolasa",1,"Russia");
        expected.add(restaurant1);
        expected.add(restaurant2);
        expected.add(restaurant3);
        return  expected;
    }
}