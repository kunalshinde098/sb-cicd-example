package com.study.cicd;

import lombok.Data;
import lombok.NonNull;

/**
 * This is my person object
 */
@Data
public class Person {

    @NonNull
    private String name;
    @NonNull
    private String lastname;
}
