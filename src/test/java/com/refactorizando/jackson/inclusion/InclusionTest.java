package com.refactorizando.jackson.inclusion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class InclusionTest {

  @Test
  public void shouldSerializeAnimals() throws JsonProcessingException {

    PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator
        .builder()
        .allowIfSubType(Animal.class)
        .build();

    ObjectMapper mapper =
        JsonMapper.builder()
            .activateDefaultTyping(ptv, DefaultTyping.NON_CONCRETE_AND_ARRAYS)
            .build();

    Dog dog = new Dog("mammal", 4, "Huski");
    Ostrich ostrich = new Ostrich("oviparous ", 2, 5);

    List<Animal> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(ostrich);

    Vet vet = new Vet();
    vet.setAnimals(animals);
    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet);

    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet));

  }
}
