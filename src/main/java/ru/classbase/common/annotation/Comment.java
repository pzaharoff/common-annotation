package ru.classbase.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Any comment
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER})
public @interface Comment {
    /**
     * @return Comment value
     */
    String value();

    /**
     * @return Comment group
     */
    String group() default "";

    /**
     * @return Comment tags
     */
    String[] tags() default {};
}
