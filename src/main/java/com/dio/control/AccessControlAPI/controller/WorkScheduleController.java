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
    public WorkSchedule createJornada (@RequestBody WorkSchedule workSchedule){
        return workScheduleService.save(workSchedule);
    }

    //Request elements from database = Get
    //List all
    @GetMapping
    public List<WorkSchedule> getJornadaList(){
        return workScheduleService.findAll();
    }

    //Response entity treats the HTTP numeric feedback (ex. 404)
    @GetMapping("{/idJornada}")
    public ResponseEntity<WorkSchedule> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(workScheduleService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada")));
    }

    //Update = Put
    @PutMapping
    public WorkSchedule updateJornada (@RequestBody WorkSchedule workSchedule){
        return workScheduleService.update(workSchedule);
    }

    //Delete
    @DeleteMapping("{/idJornada}")
    public ResponseEntity deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            workScheduleService.delete(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkSchedule>) ResponseEntity.ok();
    }

}
