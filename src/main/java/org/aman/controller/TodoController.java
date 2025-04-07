package org.aman.controller;

import org.aman.dto.Request;
import org.aman.factory.RequestHandlerFactory;
import org.aman.model.Todo;

public class TodoController {

    private Todo createTodo(Request request) {
        RequestHandlerFactory.getHandlersForCreateTodo().handle(request);
        // return a new todo
        return new Todo();

    }
}
