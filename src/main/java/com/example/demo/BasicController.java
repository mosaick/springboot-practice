package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BasicController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/todo")
    public Todo basic() {
        Todo todo = Todo.builder()
                .id(counter.incrementAndGet())
                .title("라면사오기")
                .build();
        return todo;
    }
}
