package com.example.db.demo.runner;

import com.example.db.demo.entity.Student;
import com.example.db.demo.repositories.StudentRepo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class AppRunner implements ApplicationRunner {

    private final StudentRepo studentRepo;

    public AppRunner(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Student student  = new Student();
        student.setNishName("babumushai bandoonbaaz!");
        this.studentRepo.save(student);

        Student student2  = new Student();
        student2.setNishName("ratlam");
        this.studentRepo.save(student2);

        Student student3  = new Student();
        student3.setNishName("bruv");
        this.studentRepo.save(student3);

        Thread.sleep(3000);

        Student byNishName = this.studentRepo.findByNishName("bruv");
        System.out.println(byNishName.getId() + " this is the id! ");
    }
}
