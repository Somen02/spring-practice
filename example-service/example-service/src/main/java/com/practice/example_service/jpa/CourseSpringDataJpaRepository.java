package com.practice.example_service.jpa;

import com.practice.example_service.coursepack.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);//we can create custom methods in JPA
}
