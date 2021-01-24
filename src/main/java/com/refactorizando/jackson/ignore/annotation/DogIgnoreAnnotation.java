package com.refactorizando.jackson.ignore.annotation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties({ "type", "model" })
@Getter
@Setter
public class DogIgnoreAnnotation extends AnimalIgnoreAnnotation{

  private String model;

  private String name;

  public DogIgnoreAnnotation(String type, int legsNumber, String model, String name) {
    super(type, legsNumber);
    this.model = model;
    this.name = name;
  }
}
