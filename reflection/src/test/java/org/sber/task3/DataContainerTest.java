package org.sber.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sber.task1.WeekDayInheritance;
import org.sber.task2.RepeatAnnotation;
import org.sber.task4.ChildClass1;
import org.sber.task4.ChildClass2;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataContainerTest {

    @Test
    void testCreateInstances() {
        LocalDate date = LocalDate.of(2023, 7, 12);
        DataContainer dataContainer = new DataContainer(10, "Hello");

        List<Object> instances = createInstances(date, dataContainer);

        Assertions.assertEquals(2, instances.size());
        Assertions.assertTrue(instances.get(0) instanceof ChildClass1);
    }

    @Test
    void testInvokeMethodsInSequence() {
        ChildClass1 childClass1 = new ChildClass1();
        ChildClass2 childClass2 = new ChildClass2();

        DataContainer dataContainer = new DataContainer(10, "Hello");
        invokeMethodsInSequence(childClass1, dataContainer);
        invokeMethodsInSequence(childClass2, dataContainer);

        Assertions.assertEquals("Hello", dataContainer.getStringValue());
        Assertions.assertEquals(10, dataContainer.getIntValue());
    }

    @Test
    void testCheckDataContainerChanges() {
        DataContainer dataContainer = new DataContainer(10, "Hello");

        checkDataContainerChanges(dataContainer);
    }

    // Task 1
    private List<Object> createInstances(LocalDate date, DataContainer dataContainer) {
        List<Object> instances = new ArrayList<>();

        WeekDayInheritance childClass1Annotation = ChildClass1.class.getAnnotation(WeekDayInheritance.class);
        if (childClass1Annotation != null && childClass1Annotation.weekday() == date.getDayOfMonth()) {
            instances.add(new ChildClass1());
        }

        WeekDayInheritance childClass2Annotation = ChildClass2.class.getAnnotation(WeekDayInheritance.class);
        if (childClass2Annotation != null && childClass2Annotation.weekday() == date.getDayOfMonth()) {
            instances.add(new ChildClass2());
        }

        return instances;
    }


    // Task 2
    private void invokeMethodsInSequence(Object instance, DataContainer dataContainer) {
        Method[] methods = instance.getClass().getDeclaredMethods();

        for (Method method : methods) {
            RepeatAnnotation[] annotations = method.getAnnotationsByType(RepeatAnnotation.class);
            for (RepeatAnnotation annotation : annotations) {
                if (annotation.priority() == getPriority(instance)) {
                    try {
                        method.invoke(instance, dataContainer);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    private int getPriority(Object instance) {
        WeekDayInheritance annotation = instance.getClass().getAnnotation(WeekDayInheritance.class);
        if (annotation != null) {
            return annotation.weekday();
        }
        return 0;
    }

    // Task 3
    private void checkDataContainerChanges(DataContainer dataContainer) {
        Class<?> dataContainerClass = dataContainer.getClass();

        for (Method method : dataContainerClass.getDeclaredMethods()) {
            if (method.getName().startsWith("get")) {
                try {
                    Object value = method.invoke(dataContainer);
                    System.out.println("Field: " + method.getName().substring(3) + ", Value: " + value);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
