package com.refactorizando.jackson.ignore.introspection;

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
    @Type(value = DogIgnoreIntrospection.class, name = "dog"),
    @Type(value = OstrichIgnoreIntrospection.class, name = "ostrich")
})
public abstract class AnimalIgnoreIntrospection {

  private String type;
  private int legsNumber;

  protected AnimalIgnoreIntrospection(String type, int legsNumber) {
    this.type = type;
    this.legsNumber = legsNumber;
  }
}
