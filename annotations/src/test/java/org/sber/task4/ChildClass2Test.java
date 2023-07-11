package org.sber.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sber.task1.WeekDayInheritance;
import org.sber.task3.DataContainer;
import org.sber.task2.RepeatAnnotation;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ChildClass2Test {
    @Test
    void testWeekDayInheritance(){
        WeekDayInheritance baseClass = BaseClass.class.getAnnotation(WeekDayInheritance.class);
        WeekDayInheritance childClass1 = ChildClass1.class.getAnnotation(WeekDayInheritance.class);
        WeekDayInheritance childClass2 = ChildClass2.class.getAnnotation(WeekDayInheritance.class);

        assertEquals(baseClass.weekday(),25);
    }
    @Test
    void checkMethodOne() throws NoSuchMethodException {
        Method method = ChildClass2.class.getMethod("checkMethodOne", DataContainer.class);
        RepeatAnnotation annotation = method.getAnnotation(RepeatAnnotation.class);

        assertThrows(NullPointerException.class, () -> ChildClass2.checkMethodOne(null));
        assertEquals(annotation.hours(),3);
        assertEquals(annotation.priority(), 2);
        assertEquals(annotation.description(), "vodka");
    }

    @Test
    void checkMethodTwo() throws NoSuchMethodException {
        Method method = ChildClass2.class.getMethod("checkMethodTwo", DataContainer.class);
        RepeatAnnotation annotation = method.getAnnotation(RepeatAnnotation.class);

        assertThrows(NullPointerException.class, () -> ChildClass2.checkMethodTwo(null));
        assertEquals(annotation.hours(),5);
        assertEquals(annotation.priority(), 1);
        assertEquals(annotation.description(), "putin");
    }
}