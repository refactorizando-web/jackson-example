package com.refactorizando.jackson.inclusion.annotation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,

    property = "animalType")
@JsonSubTypes({
    @Type(value = DogInclusionAnnotation.class, name = "dog"),
    @Type(value = OstrichInclusionAnnotation.class, name = "ostrich")
})
public abstract class AnimalInclusionAnnotation {

  private String type;
  private int legsNumber;

  protected AnimalInclusionAnnotation(String type, int legsNumber) {
    this.type = type;
    this.legsNumber = legsNumber;
  }
}
