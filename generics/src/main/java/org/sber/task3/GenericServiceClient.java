package org.sber.task3;

public class GenericServiceClient<S, Q> {
    private RequestValidator<S> requestValidator;
    private ResponseValidator<Q> responseValidator;
    private ExternalService<S, Q> externalService;

    public GenericServiceClient(RequestValidator<S> requestValidator,
                                ResponseValidator<Q> responseValidator,
                                ExternalService<S, Q> externalService) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
        this.externalService = externalService;
    }

    public Q executeService(S request) {
        if (!requestValidator.validate(request)) {
            throw new IllegalArgumentException("Ошибка запроса");
        }

        Q response = externalService.execute(request);

        if (!responseValidator.validate(response)) {
            throw new IllegalArgumentException("Ошибка ответа");
        }

        return response;
    }
}
