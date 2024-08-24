package com.example.db.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassNew {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long classId;

    @Column(name="className")
    private String className;

    @OneToMany(mappedBy="classNew", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<StudentNew> students;


}
