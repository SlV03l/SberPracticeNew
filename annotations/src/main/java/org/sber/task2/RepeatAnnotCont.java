package org.sber.task2;

import org.sber.task2.RepeatAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface  RepeatAnnotCont {
    RepeatAnnotation[] value();
}
