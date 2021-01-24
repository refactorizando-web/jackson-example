package com.refactorizando.jackson.ignore.annotation;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VetIgnoreAnnotation {

  private List<AnimalIgnoreAnnotation> animalIgnoreAnnotationList = new ArrayList<>();

}
