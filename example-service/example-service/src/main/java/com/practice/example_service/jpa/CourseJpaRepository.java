package com.practice.example_service.jpa;

import com.practice.example_service.coursepack.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;//it will manage all communication with database

    public void insert(Course course){
        entityManager.merge(course);// for inserting course
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);// for fetching course
    }

    public void deleteById(long id){
        Course course = findById(id);
        entityManager.remove(course);
    }
}
