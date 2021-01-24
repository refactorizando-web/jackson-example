package com.refactorizando.jackson.ignore.introspection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DogIgnoreIntrospection extends AnimalIgnoreIntrospection {
  private String model;

  public DogIgnoreIntrospection(String type, int legsNumber, String model) {
    super(type, legsNumber);
    this.model = model;
  }

}
