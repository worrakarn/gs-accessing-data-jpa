package com.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.Course;

public interface CourseService {
	List<Course> getAllCourse(Long id);
	void addCourse(@RequestBody Course course);
}
