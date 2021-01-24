package com.refactorizando.jackson.inclusion.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DogInclusionAnnotation extends AnimalInclusionAnnotation {
  private String model;

  public DogInclusionAnnotation(String type, int legsNumber, String model) {
    super(type, legsNumber);
    this.model = model;
  }

}
