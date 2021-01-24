package com.refactorizando.jackson.inclusion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {

  private String type;
  private int legsNumber;

  protected Animal(String type, int legsNumber) {
    this.type = type;
    this.legsNumber = legsNumber;
  }
}
