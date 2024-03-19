package com.exercise.educationmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/course-materials")
    public String courseMaterials(){
        return "course-materials";
    }

    @GetMapping("/grades")
    public String viewGrades(){
        return "grades";
    }

    @GetMapping("/assignments")
    public String assignments(){
        return "assignments";
    }

    @GetMapping("/add-assignment")
    public String addAssignment(){
        return "add-assignment";
    }

    @GetMapping("/view-assignments")
    public String viewAssignments(){
        return "view-assignments";
    }
}
