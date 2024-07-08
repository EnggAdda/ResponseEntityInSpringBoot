package org.example.responseentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class StudentController {

    @Autowired
    private StudentService  studentService;

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable String id) {
       return  studentService.getStudent(id);
    }

    @GetMapping("/getStudent1/{id}")
    public ResponseEntity<Student> getStudent1(@PathVariable String id) {
          Student st  =studentService.getStudent(id);
        HttpHeaders headers = new HttpHeaders();
        headers.set("CustomeHeader", "abc");
       //   return ResponseEntity.status(HttpStatus.OK).headers(headers).body(st);
        return new ResponseEntity<>(st, headers, HttpStatus.OK);

    }
}
