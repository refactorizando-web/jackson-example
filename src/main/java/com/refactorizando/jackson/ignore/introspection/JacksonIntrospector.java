package com.refactorizando.jackson.ignore.introspection;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class JacksonIntrospector extends JacksonAnnotationIntrospector {
  public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
    return annotatedMember.getDeclaringClass() == AnimalIgnoreIntrospection.class && annotatedMember.getName() == "type"
        || annotatedMember.getDeclaringClass() == DogIgnoreIntrospection.class
        || annotatedMember.getName() == "legsNumber"
        || super.hasIgnoreMarker(annotatedMember);
  }
}