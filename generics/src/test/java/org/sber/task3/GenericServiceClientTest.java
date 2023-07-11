package org.sber.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericServiceClientTest {

    @Test
    void executeService() {
        RequestValidator<String> requestValidator = request -> true;
        ResponseValidator<Integer> responseValidator = response -> true;
        ExternalService<String, Integer> externalService = request -> 100;

        GenericServiceClient<String, Integer> serviceClient =
                new GenericServiceClient<>(requestValidator, responseValidator, externalService);

        Integer result = serviceClient.executeService("test");

        assertEquals(100, result);
    }
}