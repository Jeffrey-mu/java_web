package org.example;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wjf
 */
@Component
public class AnimalHandler {

    private static final String template = "我是一个动物, %s!";

    private final AtomicLong counter = new AtomicLong();

    public RouterFunction<ServerResponse> routes() {
        return RouterFunctions.route()
            .GET("/animal", this::animal)
            .build();
    }

    public Mono<ServerResponse> animal(ServerRequest req) {
        final String name = req.queryParam("name").orElse("cat");
        String address = "cat";
        return ServerResponse.ok().syncBody(new Animal(counter.incrementAndGet(),
            String.format(template, name), name, address));
    }
}