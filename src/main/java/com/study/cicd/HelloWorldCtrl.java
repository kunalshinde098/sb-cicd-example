package com.study.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCtrl {

    /**
     * Added prson api
     * @param name
     * @return
     */
    @GetMapping(value = "/person/{name}", produces ="application/json")
    public Person getPerson(@PathVariable String name){
        return  new Person(name, "Shinde*");
    }

}
