package org.aman.handlers;

import org.aman.dto.Request;

public class ValidateParamsHandler implements RequestHandler{
    private final RequestHandler nextHandler;

    public ValidateParamsHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("ValidateParamsHandler: Validating the request parameters");
        this.nextHandler.handle(request);

    }
}
