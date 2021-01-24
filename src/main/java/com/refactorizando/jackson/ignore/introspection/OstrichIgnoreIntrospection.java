package com.refactorizando.jackson.ignore.introspection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OstrichIgnoreIntrospection extends AnimalIgnoreIntrospection {
  private int age;

  public OstrichIgnoreIntrospection(String type, int legsNumber, int age) {
    super(type, legsNumber);
    this.age = age;
  }

}
