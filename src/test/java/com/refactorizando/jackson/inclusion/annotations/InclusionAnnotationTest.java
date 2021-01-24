package com.refactorizando.jackson.inclusion.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.refactorizando.jackson.inclusion.annotation.AnimalInclusionAnnotation;
import com.refactorizando.jackson.inclusion.annotation.DogInclusionAnnotation;
import com.refactorizando.jackson.inclusion.annotation.OstrichInclusionAnnotation;
import com.refactorizando.jackson.inclusion.annotation.VetInclusionAnnotation;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class InclusionAnnotationTest {

  @Test
  public void shouldSerializeAnimals()  throws JsonProcessingException {


    ObjectMapper mapper = new ObjectMapper();


    DogInclusionAnnotation dog = new DogInclusionAnnotation("mammal", 4, "Huski");
    OstrichInclusionAnnotation ostrich = new OstrichInclusionAnnotation("oviparous ", 2, 5);

    List<AnimalInclusionAnnotation> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(ostrich);

    VetInclusionAnnotation vet = new VetInclusionAnnotation();
    vet.setAnimalInclusionAnnotations(animals);

    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vet));

  }
}
