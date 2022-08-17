package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Controller
public class WelcomeHandler {

    public RouterFunction<ServerResponse> routes() {
        System.out.printf("hello world");
        return RouterFunctions.route()
            .GET("/", this::welcome)
            .build();
    }

    public Mono<ServerResponse> welcome(ServerRequest req) {
        final URI uri = req.uriBuilder().path("index.html").build();
        return ServerResponse.seeOther(uri).build();
    }
}