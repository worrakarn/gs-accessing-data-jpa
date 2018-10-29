package com.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, String>{

	List<Course> findByCustomerId(Long id);

}
