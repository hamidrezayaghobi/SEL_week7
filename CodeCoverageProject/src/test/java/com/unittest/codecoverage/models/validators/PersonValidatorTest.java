package com.unittest.codecoverage.models.validators;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import com.unittest.codecoverage.exceptions.PersonException;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.models.Gender;

public class PersonValidatorTest {

    @Test
    public void testValidate_withInvalidPerson_shouldThrowException() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();

        assertThatThrownBy(() -> validator.validate(person))
                .isInstanceOf(PersonException.class)
                .hasMessageContaining("Name is Required")
                .hasMessageContaining("Gender is Required");
    }

    @Test
    public void testRequiredName_withEmptyPersonName_shouldReturnFalse() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();

        boolean result = validator.requiredName(person);

        assertThat(result).isFalse();
    }
    @Test
    public void testRequiredName_withValidPerson_shouldReturnTrue() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();
        person.setName("Haji");

        boolean result = validator.requiredName(person);

        assertThat(result).isTrue();
    }



    @Test
    public void testRequiredName_withValidName_shouldReturnTrue() {
        PersonValidator validator = new PersonValidator();
        String name = "Haj Agha";

        boolean result = validator.requiredName(name);

        assertThat(result).isTrue();
    }

    @Test
    public void testRequiredName_withEmptyName_shouldReturnFalse() {
        PersonValidator validator = new PersonValidator();
        String name = " ";

        boolean result = validator.requiredName(name);

        assertThat(result).isFalse();
    }

    @Test
    public void testRequiredGender_withNullPerson_shouldReturnFalse() {
        PersonValidator validator = new PersonValidator();
        Person person = null;

        boolean result = validator.requiredGender(person);

        assertThat(result).isFalse();
    }

    @Test
    public void testRequiredGender_withValidPerson_shouldReturnTrue() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();
        person.setGender(Gender.M);

        boolean result = validator.requiredGender(person);

        assertThat(result).isTrue();
    }

    @Test
    public void testValidate_withValidPerson_shouldNotThrowException() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();
        person.setName("Alireza");
        person.setGender(Gender.M);

        assertThatCode(() -> validator.validate(person)).doesNotThrowAnyException();
    }
}