package com.example.db.demo.controllers;

import com.example.db.demo.awrapper.ClassDto;
import com.example.db.demo.entity.ClassNew;
import com.example.db.demo.entity.StudentNew;
import com.example.db.demo.entity.StudentNewNew;
import com.example.db.demo.repositories.NewClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class StudentController {

    @Autowired
    private NewClassRepo newClassRepo;

    @GetMapping("/getClass/{classId}")
    public ClassDto getClassName(@PathVariable Long classId) {

        Optional<ClassNew> byId = newClassRepo.findById(classId);

        ClassNew classNew = byId.get();

        ClassDto classDto = new ClassDto();
        classDto.setClassName(classNew.getClassName());

        List<StudentNew> students = classNew.getStudents();
        System.out.println("printing student size");
        System.out.println(students.size());

        List<StudentNewNew> list = new ArrayList<>();

        for (StudentNew s : students) {
            StudentNewNew a = new StudentNewNew();
            a.setName(s.getName());
            a.setId(s.getId());
            a.setClassName(classNew.getClassName());
            list.add(a);
        }

        classDto.setStudents(list);

        return classDto;
    }
}
