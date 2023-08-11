package ru.classbase.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Any label
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER})
public @interface Label {
    /**
     * @return Label value
     */
    String value();

    /**
     * @return Label group
     */
    String group() default "";

    /**
     * @return Label tags
     */
    String[] tags() default {};
}
