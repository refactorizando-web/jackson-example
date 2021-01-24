package com.refactorizando.jackson.ignore.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AnimalIgnoreAnnotation {

  private String type;
  private int legsNumber;

  protected AnimalIgnoreAnnotation(String type, int legsNumber) {
    this.type = type;
    this.legsNumber = legsNumber;
  }
}
