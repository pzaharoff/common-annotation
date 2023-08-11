package ru.classbase.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Any note
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER})
public @interface Note {
    /**
     * @return Note value
     */
    String value();

    /**
     * @return Note group
     */
    String group() default "";

    /**
     * @return Note tags
     */
    String[] tags() default {};
}
