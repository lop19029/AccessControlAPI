package com.dio.control.AccessControlAPI.service;

import com.dio.control.AccessControlAPI.model.School;
import com.dio.control.AccessControlAPI.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<School> getById(Long idSchool) {
        return schoolRepository.findById(idSchool);
    }

    public School update(School school) {return schoolRepository.save(school); }

    public void delete(Long idSchool) {
        schoolRepository.deleteById(idSchool);
    }
}
