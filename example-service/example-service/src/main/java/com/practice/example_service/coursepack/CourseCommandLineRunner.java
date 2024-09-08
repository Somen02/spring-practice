package com.practice.example_service.coursepack;

import com.practice.example_service.jdbc.CourseJdbcRepository;
import com.practice.example_service.jpa.CourseJpaRepository;
import com.practice.example_service.jpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseRepository;

//    @Autowired
//    private CourseJpaRepository courseRepository;

    @Autowired
    private CourseSpringDataJpaRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseRepository.insert(new Course(1,"Learn AWS","Somen"));
//        courseRepository.insert(new Course(2,"Learn Devops","Rakshit"));
//        courseRepository.insert(new Course(3,"Learn Java","Aryan"));

        courseRepository.save(new Course(1,"Learn AWS","Somen"));
        courseRepository.save(new Course(2,"Learn Devops","Rakshit"));
        courseRepository.save(new Course(3,"Learn Java","Aryan"));
        courseRepository.deleteById(3l);

        System.out.println(courseRepository.findById(2l));
        System.out.println(courseRepository.findById(1l));
        System.out.println(courseRepository.findAll());
        System.out.println(courseRepository.findByAuthor("Somen"));

    }
}
