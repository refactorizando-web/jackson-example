package com.refactorizando.jackson.ignore.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OstrichIgnoreAnnotation extends AnimalIgnoreAnnotation{

  private int age;

  public OstrichIgnoreAnnotation(String type, int legsNumber, int age) {
    super(type, legsNumber);
    this.age = age;
  }
}
