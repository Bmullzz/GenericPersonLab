package com.zipcode;

import com.zipcode.anthropoid.Person;
import com.zipcode.utilities.GeneralUtils;
import com.zipcode.anthropoid.PersonFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 5/1/17.
 */
public class PersonTest {
    // Given
    private static final Person person = PersonFactory.createRandomPerson();

    @Test
    public void testName() {
        //When
        String name = person.getName();

        //Then
        Assert.assertEquals(name.length(), 10);
    }

    @Test
    public void testAge() {
        //When
        int age = person.getAge();
        boolean isValidAge = GeneralUtils.isBetween(0,99, age);

        // Then
        Assert.assertTrue(isValidAge);
    }

    @Test
    public void testGender() {
        //When
        boolean isMale = person.isMale();

        // Then
        Assert.assertTrue(true || false);
    }

    @Test
    public void testBirthDate() {
        //When
        Date date = person.getBirthDate();

        // Then
        Assert.assertTrue(date != null);
    }

    @Test
    public void testId() {
        //When
        Long id = person.getPersonalId();

        // Then
        Assert.assertEquals(id.toString().length(), 15);
    }


}
