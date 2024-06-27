### Exercise: Role-Based Access Control in Educational Management System

#### Objective:
This exercise aims to implement role-based access control within an educational management system. You will understand how to manage user roles and restrict access to various educational resources and administrative functions based on those roles. Secure password storage using bcrypt encryption will also be emphasized.

#### Instructions:
1.	Database Setup:
    -	Set up a MySQL database named education_db.
    -	Create tables for users, roles, and permissions with bcrypt encryption for passwords.
    -	Include tables for student records, course information, and administrative data.
2.	Spring MVC Application:
    -	Develop controllers (StudentController.java, TeacherController.java, AdminUserController.java) and security configuration (SecurityConfig.java).
    -	Implement methods for students to view course materials, teachers to manage courses and grades, and administrators to handle user accounts and system configurations.
    -	Configure Spring Security to enforce role-based access control.
3.	HTML Templates:
    -	Create templates (home.html, course-materials.html, grade-management.html, admin-panel.html, unauthorized.html) for different system pages.
    -	Customize templates to display content based on user roles and permissions.
4.	Functionality:
    -	Allow students to access course materials, submit assignments, and view grades.
    -	Enable teachers to manage course content, grade assignments, and communicate with students.
    -	Provide administrators with tools to manage user accounts, reset passwords, and configure system settings.
    -	Ensure sensitive administrative functions are accessible only to authorized personnel.
