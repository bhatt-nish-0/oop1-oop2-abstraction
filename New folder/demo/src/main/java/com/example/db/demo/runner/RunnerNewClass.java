package com.example.db.demo.runner;

import com.example.db.demo.entity.ClassNew;
import com.example.db.demo.entity.StudentNew;
import com.example.db.demo.repositories.NewClassRepo;
import com.example.db.demo.repositories.NewStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerNewClass implements ApplicationRunner {

    @Autowired
    private NewClassRepo newClassRepo;

    @Autowired
    private NewStudentRepo newStudentRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ClassNew classNew = new ClassNew();
        classNew.setClassName("maths");
        ClassNew save = newClassRepo.save(classNew);

        StudentNew studentNew = new StudentNew();
        studentNew.setName("nish");
        studentNew.setClassNew(save);

        StudentNew studentNew2 = new StudentNew();
        studentNew2.setName("bhatt");
        studentNew2.setClassNew(save);

        StudentNew studentNew3 = new StudentNew();
        studentNew3.setName("blingz");
        studentNew3.setClassNew(save);

        newStudentRepo.save(studentNew);
        newStudentRepo.save(studentNew2);
        newStudentRepo.save(studentNew3);

        ClassNew classNew2 = new ClassNew();
        classNew2.setClassName("science");
        ClassNew save2 = newClassRepo.save(classNew2);

        StudentNew studentNew4 = new StudentNew();
        studentNew4.setName("harita");
        studentNew4.setClassNew(save2);

        StudentNew studentNew5 = new StudentNew();
        studentNew5.setName("banyan-tree");
        studentNew5.setClassNew(save2);

        newStudentRepo.save(studentNew5);
        newStudentRepo.save(studentNew4);



    }
}
