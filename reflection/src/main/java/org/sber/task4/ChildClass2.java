package org.sber.task4;

import org.sber.task1.WeekDayInheritance;
import org.sber.task3.DataContainer;
import org.sber.task2.RepeatAnnotation;
import lombok.NonNull;
@WeekDayInheritance(weekday = 12)
public class ChildClass2 extends BaseClass {
    @RepeatAnnotation(hours = 3, priority = 2, description = "vodka")
    public static void checkMethodOne(@NonNull DataContainer arg1){
    }

    @RepeatAnnotation(hours = 5, priority = 1, description = "putin")
    public static void checkMethodTwo(@NonNull DataContainer arg2) {
    }
}

