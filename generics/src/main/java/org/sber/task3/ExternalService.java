package org.sber.task3;

public interface ExternalService<Q, S> {
    S execute(Q request);
}
