package org.sber.task3;

public interface ResponseValidator<T> {
    boolean validate(T response);
}
