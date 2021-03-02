package com.example.demo.controller;

import com.example.demo.dto.Student;
import com.example.demo.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    Logger log= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("addStudent")
    public void addStudent(){
        Student stu=new Student("admin","man");
        log.info("StudentController-addStudent,插入学生:{}",stu);
        studentMapper.save(stu);
    }
    @GetMapping("updateStudent/{id}/{name}")
    public void updateStudent(@PathVariable Integer id, @PathVariable String name){
        Student stu=studentMapper.findById(id).get();
        stu.setUsername(name);
        log.info("StudentController-addStudent,待修改学生ID:{}",id);
        studentMapper.save(stu);
    }

    @GetMapping("selectStudent/{id}")
    public Student selectStudent(@PathVariable Integer id){
        log.info("StudentController-addStudent,查找学生ID:{}",id);
        return studentMapper.findById(id).get();
    }

    @GetMapping("selectAll")
    public List<Student> selectAll(){
        return studentMapper.findAll();
    }

    @GetMapping("deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id){
        log.info("StudentController-addStudent,待删除学生ID:{}",id);
        studentMapper.deleteById(id);
    }
}
