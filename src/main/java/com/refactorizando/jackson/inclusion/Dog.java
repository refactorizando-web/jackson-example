package com.refactorizando.jackson.inclusion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {
  private String model;

  public Dog(String type, int legsNumber, String model) {
    super(type, legsNumber);
    this.model = model;
  }

}
