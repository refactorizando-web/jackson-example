package com.refactorizando.jackson.inclusion.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OstrichInclusionAnnotation extends AnimalInclusionAnnotation {
  private int age;

  public OstrichInclusionAnnotation(String type, int legsNumber, int age) {
    super(type, legsNumber);
    this.age = age;
  }

}
