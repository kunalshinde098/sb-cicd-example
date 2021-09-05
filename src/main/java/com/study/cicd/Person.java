package com.study.cicd;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class Person {

    @NonNull
    private String name;
    @NonNull
    private String lastname;
}
