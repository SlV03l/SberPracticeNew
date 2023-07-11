package org.sber.task3;

public interface RequestValidator<T> {
    boolean validate(T request);
}
