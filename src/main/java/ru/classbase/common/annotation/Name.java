package ru.classbase.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Any name
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER})
public @interface Name {
    /**
     * @return Name value
     */
    String value();

    /**
     * @return Name group
     */
    String group() default "";

    /**
     * @return Name tags
     */
    String[] tags() default {};
}
