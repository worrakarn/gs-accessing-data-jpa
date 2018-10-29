package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Course;
import com.app.model.Customer;
import com.app.service.CourseService;

@RestController
@RequestMapping("/customers")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/{id}/course")
	public List<Course> getAllCourse(@PathVariable Long id){
		
		return courseService.getAllCourse(id);
	}
	
	@PostMapping("/{id}/course")
	public void addCustomer(@PathVariable Long id, @RequestBody Course course) {
		course.setCustomer(new Customer(id, "", ""));
		courseService.addCourse(course);
	}
	

}
