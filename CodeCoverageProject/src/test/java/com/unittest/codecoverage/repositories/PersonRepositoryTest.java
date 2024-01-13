package com.unittest.codecoverage.repositories;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class PersonRepositoryTest {
    @Test
    public void testUpdateWithNullPerson_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.update(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("Person can't be null");
    }

    @Test
    public void testDelete_withNullName_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.delete(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("Null?!");
    }

    @Test
    public void testDelete_withValidName_shouldNotThrowException() {
        PersonRepository repository = new PersonRepository();
        String name = "Alireza Yaghoubi";

        assertThatCode(() -> repository.delete(name)).doesNotThrowAnyException();
    }

    @Test
    public void testInsertWithNullPerson_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.insert(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("It can't be Null");
    }

    @Test
    public void testGet_withNullName_shouldThrowNullPointerException() {
        PersonRepository repository = new PersonRepository();

        assertThatThrownBy(() -> repository.get(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("It can't Null");
    }


}