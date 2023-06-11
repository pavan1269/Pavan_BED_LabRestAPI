package com.gl.student.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.student.dto.StudentDTO;
import com.gl.student.entity.Student;
import com.gl.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping(path = "/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody StudentDTO studentDto){
		return ResponseEntity.ok(studentService.saveStudent(studentDto));
	}
	
	@PutMapping(path = "/updateStudent/{studentId}")
	public ResponseEntity<Student> updateStudentById(@RequestBody StudentDTO studentDto, @PathVariable(value = "studentId") String studentId){
		return ResponseEntity.ok(studentService.updateStudent(studentDto, studentId));
	}
	
	@DeleteMapping(path = "/deleteStudent/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable(value = "studentId") String studentId){
		return ResponseEntity.ok(studentService.deleteteStudent(studentId));
	}
	
	@GetMapping(path="/allStudents")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return ResponseEntity.ok(studentService.getAllStudents());
	}
}
