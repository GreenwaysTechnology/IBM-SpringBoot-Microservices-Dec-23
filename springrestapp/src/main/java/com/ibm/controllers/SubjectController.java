package com.ibm.controllers;

import com.ibm.enity.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @GetMapping
    public String findSubject() {
        return "Java";
    }

    @GetMapping("/one")
    public Subject getSubject() {
        return new Subject(1, "spring");
    }

    @GetMapping("/list")
    public List<Subject> getSubjects() {
        return List.of(new Subject(1, "spring"), new Subject(2, "microservices"));
    }

    //    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public String save() {
//        return "saved";
//    }
    @PostMapping
    public ResponseEntity<String> save() {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("secrete", "abc")
                .body("saved");

    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove() {
        System.out.println("removed");
    }


}
