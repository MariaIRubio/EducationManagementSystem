package com.exercise.educationmanagementsystem.controller;

import com.exercise.educationmanagementsystem.entity.Course;
import com.exercise.educationmanagementsystem.repo.CourseRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping("/manage-courses")
    public String manageCourses(){
        return "course-management";
    }

    @GetMapping("/add-course")
    public String addCourse(Model model){
        model.addAttribute("course", new Course());
        return "add-course";
    }

    @PostMapping("/processAddCourseForm")
    public String processAddCourseForm(@Valid @ModelAttribute("course") Course course, BindingResult binder){
        if(binder.hasErrors()){
            return "add-course";
        } courseRepo.save(course);
        return "confirmation";
    }

    @GetMapping("/view-courses")
    public String viewCourses(Model model){
       List<Course> coursesList = courseRepo.findAll();
       model.addAttribute(coursesList);
        return "view-courses";
    }

    @GetMapping("/manage-grades")
    public String manageGrades(){
        return "grade-management";
    }

    @GetMapping("/give-grade")
    public String giveGrade(){
        return "give-grade";
    }

    @GetMapping("/update-grade")
    public String updateGrade(){
        return "update-grade";
    }

    @GetMapping("/delete-grade")
    public String deleteGrade(){
        return "delete-grade";
    }

    @GetMapping("/contact-student")
    public String contactStudent(){
        return "contact-student";
    }

}
