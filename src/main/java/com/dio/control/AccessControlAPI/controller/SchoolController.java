package com.dio.control.AccessControlAPI.controller;

import com.dio.control.AccessControlAPI.model.School;
import com.dio.control.AccessControlAPI.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping
    public School createSchool (@RequestBody School school){
        return schoolService.save(school);
    }
}
