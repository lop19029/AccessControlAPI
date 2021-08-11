package com.dio.control.AccessControlAPI.service;

import com.dio.control.AccessControlAPI.model.School;
import com.dio.control.AccessControlAPI.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {


    SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public School save(School school){ return schoolRepository.save(school);}


    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
