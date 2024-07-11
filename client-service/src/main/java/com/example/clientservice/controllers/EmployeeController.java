package com.example.clientservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/employee")
public class EmployeeController {

  @GetMapping()
  public String showEmp() {
    return "Employee URL";
  }

}
