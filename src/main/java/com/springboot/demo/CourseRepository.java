package com.springboot.demo;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
//    Course update(int id, Course course);
}
