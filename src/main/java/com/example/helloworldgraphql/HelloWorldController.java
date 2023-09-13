package com.example.helloworldgraphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    @QueryMapping
    public String helloWorld() {
        return "Hello World";
    }
}
