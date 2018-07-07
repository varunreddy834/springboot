package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;


    //    List<Course> courses= Arrays.asList(new Course(101,"java","core java"),new Course(102,"sql","postgres"));
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public void createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
    }

    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable int id) {
        return courseService.getCourse(id);
    }
//    @RequestMapping(value = "/courses/{id}", method = RequestMethod.PUT)
//    public Course updateCourse(@PathVariable int id,Course course) {
//        return courseService.updateCourse(id,course);
//    }

    @RequestMapping(value = "/courses", method=RequestMethod.PUT)
    public void update(@RequestBody Course course){courseService.update(course);}
}


//    @RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
//    public Course deleteCourse(@PathVariable int id) {
//        return courseService.updateCourse(id);
//    }
