package com.example.db.demo.repositories;

import com.example.db.demo.entity.StudentNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewStudentRepo extends JpaRepository<StudentNew,Long> {
}
