package org.sber.task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WeekDayInheritance {
    int weekday() default 0;
}