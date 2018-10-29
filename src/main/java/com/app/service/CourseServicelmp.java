package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CourseRepository;
import com.app.model.Course;

@Service
public class CourseServicelmp implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourse(Long id) {

		return courseRepository.findByCustomerId(id);
	}

	@Override
	public void addCourse(Course course) {
		
		courseRepository.save(course);
	}	

}
