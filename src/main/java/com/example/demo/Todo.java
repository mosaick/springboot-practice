package com.example.demo;

import lombok.*;

@Data
@Builder
public class Todo {
    private long id;
    private String title;
}
