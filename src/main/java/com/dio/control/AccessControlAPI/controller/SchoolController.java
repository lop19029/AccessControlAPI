package com.dio.control.AccessControlAPI.controller;

import com.dio.control.AccessControlAPI.model.School;
import com.dio.control.AccessControlAPI.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping
    public School createSchool (@RequestBody School school){
        return schoolService.save(school);
    }

    @GetMapping
    public List<School> getSchoolsList() {return schoolService.findAll();}
}
