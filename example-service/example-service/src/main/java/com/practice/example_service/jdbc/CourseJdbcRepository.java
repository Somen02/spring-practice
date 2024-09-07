package com.practice.example_service.jdbc;

import com.practice.example_service.coursepack.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemp; // this will specifically talk to database

    private static String INSERT_QUERY=
            """
                    insert into course(id,name, author)
                    values(?,?,?)
                    """;
    private static String DELETE_QUERY=
            """
                    delete from course where id = ?
                    """;

    private static String SELECT_QUERY=
            """
                    Select * from course where id = ?
                    """;

    public void insert(Course course){
        springJdbcTemp.update(INSERT_QUERY,course.getId(),
                course.getName(),course.getAuthor());// for insert , update or delete statement
    }

    public void deleteById(Long id){
        springJdbcTemp.update(DELETE_QUERY,id);// for insert , update or delete statement
    }

    public Course findById(long id){
        return springJdbcTemp.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),id);// this will return the course and convert it to the given bean
        //Resultset-> Bean mapping=> Row Mapper will map it
        //id

    }
}
