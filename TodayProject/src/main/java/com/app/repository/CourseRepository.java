package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

	Optional<Course> findBytitle(String ct);
}
