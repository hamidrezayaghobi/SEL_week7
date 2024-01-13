package com.unittest.codecoverage.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTests {
    @Test
    public void testPerson_shouldSetAndGetAgeCorrectly() {
        Person person = new Person();
        person.setName("Alireza");
        person.setAge(25);
        person.setGender(Gender.F);

        Assertions.assertThat(person.getAge()).isEqualTo(25);
    }
}