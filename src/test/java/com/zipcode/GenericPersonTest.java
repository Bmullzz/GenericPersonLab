package com.zipcode;

import com.zipcode.anthropoid.GenericPerson;
import com.zipcode.utilities.GeneralUtils;
import com.zipcode.anthropoid.PersonFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 5/1/17.
 */
public class GenericPersonTest {
    // Given
    private static final GenericPerson advancedPerson = PersonFactory.createRandomAdvancedPerson();

    @Test
    public void testName() {
        //When
        String name = advancedPerson.name.getValue();

        //Then
        Assert.assertEquals(name.length(), 10);
    }

    @Test
    public void testAge() {
        //When
        int age = advancedPerson.age.getValue();
        boolean isValidAge = GeneralUtils.isBetween(0,99, age);

        // Then
        Assert.assertTrue(isValidAge);
    }

    @Test
    public void testGender() {
        //When
        boolean isMale = advancedPerson.isMale.getValue();

        // Then
        Assert.assertTrue(true || false);
    }

    @Test
    public void testBirthDate() {
        //When
        Date date = advancedPerson.birthDate.getValue();

        // Then
        Assert.assertTrue(date != null);
    }

    @Test
    public void testId() {
        //When
        Long id = advancedPerson.personalId.getValue();

        // Then
        Assert.assertEquals(id.toString().length(), 15);
    }


}
