package com.kafka.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    @GetMapping("/name")
    public ArrayList<Student> getStudent() {
        return new ArrayList<Student>(){{
            add(new Student("ravi", "mishra"));
            add(new Student("abhay", "mishra"));
            add(new Student("ram", "mishra"));

        }};
    }
    //path variable
    @GetMapping("/name/{fName}/{lName}/")
    public Student studentPathVariable(@PathVariable("fName") String fName, @PathVariable("lName") String lName){
        return new Student(fName,lName);
    }
    //rest api to handle query parameters(localhost:8080/name/query?fName=Ravi&lName=Mishra)
    @GetMapping("/name/query")
    public Student studentQueryParam(@RequestParam(name="fName") String fName,@RequestParam(name="lName") String lName){
        return new Student(fName,lName);
    }
}
