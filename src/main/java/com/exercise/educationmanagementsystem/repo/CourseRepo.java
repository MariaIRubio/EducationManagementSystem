package com.exercise.educationmanagementsystem.repo;

import com.exercise.educationmanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
