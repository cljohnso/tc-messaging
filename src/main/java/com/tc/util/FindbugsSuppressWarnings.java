/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.PACKAGE })
@Retention(RetentionPolicy.CLASS)
public @interface FindbugsSuppressWarnings {

  String[] value() default {};
}
