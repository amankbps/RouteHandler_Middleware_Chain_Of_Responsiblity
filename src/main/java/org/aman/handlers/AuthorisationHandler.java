package org.aman.handlers;

import org.aman.dto.Request;

public class AuthorisationHandler implements RequestHandler{

    private final RequestHandler nextHandler;

    public AuthorisationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("AuthorisationHandler: Authorising the request");
        this.nextHandler.handle(request);
    }
}
