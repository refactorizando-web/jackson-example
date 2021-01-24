package com.refactorizando.jackson.inclusion.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.refactorizando.jackson.ignore.annotation.AnimalIgnoreAnnotation;
import com.refactorizando.jackson.ignore.annotation.DogIgnoreAnnotation;
import com.refactorizando.jackson.ignore.annotation.OstrichIgnoreAnnotation;
import com.refactorizando.jackson.ignore.annotation.VetIgnoreAnnotation;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class IgnoreAnnotationTest {
  @Test
  public void shouldSerializeAnimals() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();

    DogIgnoreAnnotation dog = new DogIgnoreAnnotation("mammal", 4, "Huski", "bruno");
    OstrichIgnoreAnnotation ostrich = new OstrichIgnoreAnnotation("oviparous ", 2, 5);

    List<AnimalIgnoreAnnotation> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(ostrich);

    VetIgnoreAnnotation vet = new VetIgnoreAnnotation();
    vet.setAnimalIgnoreAnnotationList(animals);
    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet);

    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet));

  }
}
