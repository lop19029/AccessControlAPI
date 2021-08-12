package com.dio.control.AccessControlAPI.controller;

import com.dio.control.AccessControlAPI.model.School;
import com.dio.control.AccessControlAPI.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping
    public School createSchool (@RequestBody School school){
        return schoolService.save(school);
    }

    @GetMapping
    public List<School> getSchoolsList() {return schoolService.findAll();}

    @GetMapping("{/idSchool}")
    public ResponseEntity<School> getSchoolById(@PathVariable("idSchool") Long idSchool) throws Exception {
        return ResponseEntity.ok(schoolService.getById(idSchool).orElseThrow(() -> new NoSuchElementException("School not found in database.")));
    }

    @PutMapping
    public School updateSchool (@RequestBody School school){
        return schoolService.update(school);
    }

    @DeleteMapping("{/idSchool}")
    public ResponseEntity deleteSchoolById(@PathVariable("idSchool") Long idSchool) throws Exception {
        try {
            schoolService.delete(idSchool);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<School>) ResponseEntity.ok();
    }

}
