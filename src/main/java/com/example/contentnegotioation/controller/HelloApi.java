package com.example.contentnegotioation.controller;

import com.example.contentnegotioation.dto.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloApi {

    @GetMapping(produces = {"application/json", "application/xml", "application/x-yaml"})
    public ResponseEntity<?> init(){
        Person person = new Person();
        person.setAge(35);
        person.setName("Irlan");
        return ResponseEntity.ok(person);
    }

    @PostMapping(consumes = {"application/json"}, produces = {"application/json", "application/xml", "application/x-yaml"})
    public ResponseEntity<?> send(@RequestBody Person person){
        return ResponseEntity.ok(person);
    }
}
