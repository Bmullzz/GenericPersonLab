package com.zipcode.anthropoid;

import java.util.Date;

/**
 * Created by leon on 5/1/17.
 */
public class GenericPerson {
    public final Property<String> name;
    public final Property<Integer> age;
    public final Property<Boolean> isMale;
    public final Property<Long> personalId;
    public final Property<Date> birthDate;

    public GenericPerson(String name, int age, boolean isMale, long personalId, Date birthDate) {
        this.name = new Property<String>(name);
        this.age = new Property<Integer>(age);
        this.isMale = new Property<Boolean>(isMale);
        this.personalId = new Property<Long>(personalId);
        this.birthDate = new Property<Date>(birthDate);
    }
}
