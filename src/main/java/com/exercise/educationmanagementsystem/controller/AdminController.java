package com.exercise.educationmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

  @GetMapping("/manage-accounts")
    public String manageAccounts(){
      return "accounts-manager";
  }

  @GetMapping("/add-user")
  public String addUser(){
    return "add-user";
  }

  @GetMapping("/update-user")
  public String updateUser(){
    return "update-user";
  }

  @GetMapping("/delete-user")
  public String deleteUser(){
    return "delete-user";
  }

  @GetMapping("/view-users")
  public String viewUsers(){
    return "view-users";
  }

    @GetMapping("/configuration")
    public String configuration(){
        return "configuration";
    }
}
