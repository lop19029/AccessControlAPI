package com.dio.control.AccessControlAPI.service;

import com.dio.control.AccessControlAPI.model.WorkSchedule;
import com.dio.control.AccessControlAPI.repository.WorkScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkScheduleService {


    WorkScheduleRepository workScheduleRepository;

    @Autowired
    public WorkScheduleService(WorkScheduleRepository workScheduleRepository) {
        this.workScheduleRepository = workScheduleRepository;
    }

    public WorkSchedule save(WorkSchedule workSchedule){
        return workScheduleRepository.save(workSchedule);
    }

    public List<WorkSchedule> findAll() {
        return workScheduleRepository.findAll();
    }

    public Optional<WorkSchedule> getById(Long idWorkSchedule){
        return workScheduleRepository.findById(idWorkSchedule);
    }

    //same as save
    public WorkSchedule update(WorkSchedule workSchedule){
        return workScheduleRepository.save(workSchedule);
    }

    //similar to get by id
    public void delete(Long idWorkSchedule){
        workScheduleRepository.deleteById(idWorkSchedule);
    }
}


