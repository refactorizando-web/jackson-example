package com.refactorizando.jackson.inclusion.annotation;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VetInclusionAnnotation {

  private List<AnimalInclusionAnnotation> animalInclusionAnnotations;


}
