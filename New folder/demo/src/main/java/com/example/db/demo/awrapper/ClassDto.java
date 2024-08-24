package com.example.db.demo.awrapper;

import com.example.db.demo.entity.ClassNew;
import com.example.db.demo.entity.StudentNew;
import com.example.db.demo.entity.StudentNewNew;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDto {

    private String className;

    private List<StudentNewNew> students;


}
