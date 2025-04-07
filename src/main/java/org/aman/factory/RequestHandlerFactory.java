package org.aman.factory;

import org.aman.handlers.*;
import org.aman.service.TokenServiceImpl;

public class RequestHandlerFactory {


        public static RequestHandler getHandlersForCreateTodo() {

            return new ValidateParamsHandler(
                    new ValidateBodyHandler(
                            new AuthorisationHandler(
                                    new AuthenticationHandler(
                                            new FinishingHandler(), new TokenServiceImpl()
                                    )
                            )
                    )
            );
        }

    public static RequestHandler getHandlerForUpdateTodo() {
        return new ValidateParamsHandler(
                new HandlerB(
                        new ValidateBodyHandler(
                                new AuthorisationHandler(
                                        new AuthenticationHandler(
                                                new FinishingHandler(), new TokenServiceImpl()
                                        )
                                )
                        )
                )
        );
    }

}
