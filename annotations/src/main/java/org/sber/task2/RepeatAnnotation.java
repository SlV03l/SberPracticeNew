package org.sber.task2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(RepeatAnnotCont.class)
public @interface RepeatAnnotation {
    int hours() default 0;
    int priority() default 0;
    String description() default "";
}

