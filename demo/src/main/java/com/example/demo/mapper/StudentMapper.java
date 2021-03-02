package com.example.demo.mapper;

import com.example.demo.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMapper extends JpaRepository<Student,Integer> {
}
