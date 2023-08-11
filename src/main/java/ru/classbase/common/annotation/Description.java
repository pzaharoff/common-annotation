package ru.classbase.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Any description
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER})
public @interface Description {
    /**
     * @return Description value
     */
    String value();

    /**
     * @return Description group
     */
    String group() default "";

    /**
     * @return Description tags
     */
    String[] tags() default {};
}
