package com.gl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.student.dto.StudentDTO;
import com.gl.student.entity.Student;
import com.gl.student.repository.StudentRepositry;

@Service
public class StudentService {
    
	@Autowired
	StudentRepositry studentRepo;
	
	public Student saveStudent(StudentDTO studentDto){
		Student student=new Student(studentDto.getfName(),studentDto.getlName(),studentDto.getCourse(),studentDto.getCountry());
		return studentRepo.save(student);
	}

	public Student updateStudent(StudentDTO studentDto, String stdId) {
		Student student = studentRepo.getById(Long.valueOf(stdId));
		student.setFirst_name(studentDto.getfName());
		student.setLast_name(studentDto.getlName());
		student.setCourse(studentDto.getCourse());
		student.setCountry(studentDto.getCountry());
		return studentRepo.save(student);
	}

	public String deleteteStudent(String studentId) {
		studentRepo.deleteById(Long.valueOf(studentId));
		return "Student with ID "+studentId+" is deleted";
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}
	
}
