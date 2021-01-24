package com.refactorizando.jackson.inclusion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ostrich extends Animal {
  private int age;

  public Ostrich(String type, int legsNumber, int age) {
    super(type, legsNumber);
    this.age = age;
  }

}
