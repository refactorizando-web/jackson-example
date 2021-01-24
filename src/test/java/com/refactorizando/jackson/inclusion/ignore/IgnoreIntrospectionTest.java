package com.refactorizando.jackson.inclusion.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.refactorizando.jackson.ignore.introspection.AnimalIgnoreIntrospection;
import com.refactorizando.jackson.ignore.introspection.DogIgnoreIntrospection;
import com.refactorizando.jackson.ignore.introspection.JacksonIntrospector;
import com.refactorizando.jackson.ignore.introspection.OstrichIgnoreIntrospection;
import com.refactorizando.jackson.ignore.introspection.VetIgnoreIntrospection;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class IgnoreIntrospectionTest {

  @Test
  public void shouldSerializeAnimals() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();
    mapper.setAnnotationIntrospector(new JacksonIntrospector());

    DogIgnoreIntrospection dog = new DogIgnoreIntrospection("mammal", 4, "Huski");
    OstrichIgnoreIntrospection ostrich = new OstrichIgnoreIntrospection("oviparous ", 2, 5);

    List<AnimalIgnoreIntrospection> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(ostrich);

    VetIgnoreIntrospection vet = new VetIgnoreIntrospection();
    vet.setAnimalIgnoreIntrospections(animals);
    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet);

    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet));

  }
}
