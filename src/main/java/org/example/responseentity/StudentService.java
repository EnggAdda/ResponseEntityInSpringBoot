package org.example.responseentity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;



@Component
public class StudentService {

    public List<Student> Students( ){
        List<Student> list  = new ArrayList<Student>();
        list.add(new Student("1","Raman","Delhi"));
        list.add(new Student("2","Ram","Delhi"));
        list.add(new Student("3","Dhanush","Delhi"));
        return list;
    }

    public Student getStudent(String id){
        List<Student> list = Students();
      Student st  =  list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
   return st;
    }



}
