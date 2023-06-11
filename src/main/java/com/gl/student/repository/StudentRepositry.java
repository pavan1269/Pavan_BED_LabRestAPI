package com.gl.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.student.entity.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student,Long>{

}
