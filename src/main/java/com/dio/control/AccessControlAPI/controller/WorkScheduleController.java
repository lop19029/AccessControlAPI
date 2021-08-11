package com.dio.control.AccessControlAPI.controller;

import com.dio.control.AccessControlAPI.model.WorkSchedule;
import com.dio.control.AccessControlAPI.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/schedule")
public class WorkScheduleController {


    @Autowired
    WorkScheduleService workScheduleService;

    //Apply CRUD

    //Create = Post
    @PostMapping
    public WorkSchedule createWorkSchedule (@RequestBody WorkSchedule workSchedule){
        return workScheduleService.save(workSchedule);
    }

    //Request elements from database = Get
    //List all
    @GetMapping
    public List<WorkSchedule> getWorkScheduleList(){
        return workScheduleService.findAll();
    }

    //Response entity treats the HTTP numeric feedback (ex. 404)
    @GetMapping("{/idWorkSchedule}")
    public ResponseEntity<WorkSchedule> getWorkScheduleById(@PathVariable("idWorkSchedule") Long idWorkSchedule) throws Exception {
        return ResponseEntity.ok(workScheduleService.getById(idWorkSchedule).orElseThrow(() -> new NoSuchElementException("Work Schedule not found in database.")));
    }

    //Update = Put
    @PutMapping
    public WorkSchedule updateWorkSchedule (@RequestBody WorkSchedule workSchedule){
        return workScheduleService.update(workSchedule);
    }

    //Delete
    @DeleteMapping("{/idWorkSchedule}")
    public ResponseEntity deleteWorkScheduleById(@PathVariable("idWorkSchedule") Long idWorkSchedule) throws Exception {
        try {
            workScheduleService.delete(idWorkSchedule);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkSchedule>) ResponseEntity.ok();
    }

}
