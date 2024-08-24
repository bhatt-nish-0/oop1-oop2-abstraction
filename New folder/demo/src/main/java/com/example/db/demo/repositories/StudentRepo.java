package com.example.db.demo.repositories;

import com.example.db.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

    Student findByNishName(String name);
}
