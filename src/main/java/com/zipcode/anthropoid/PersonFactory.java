package com.zipcode.anthropoid;

import com.zipcode.utilities.RandomUtils;
import java.util.Date;

/** Created by leon on 5/1/17. */
public class PersonFactory {
    public static Person createRandomPerson() {
        String name = RandomUtils.createString('a', 'z', 10);
        int age = RandomUtils.createInteger(0, 99);
        boolean isMale = RandomUtils.chance(50);
        long personalId = System.nanoTime();
        Date birthDate = RandomUtils.createDate(1950, 2010);
        Person randomPerson = new Person(name, age, isMale, personalId, birthDate);
        return randomPerson;
    }

    public static GenericPerson createRandomAdvancedPerson() {
        String name = RandomUtils.createString('a', 'z', 10);
        int age = RandomUtils.createInteger(0, 99);
        boolean isMale = RandomUtils.chance(50);
        long personalId = System.nanoTime();
        Date birthDate = RandomUtils.createDate(1950, 2010);
        GenericPerson randomPerson = new GenericPerson(name, age, isMale, personalId, birthDate);
        return randomPerson;
    }
}
