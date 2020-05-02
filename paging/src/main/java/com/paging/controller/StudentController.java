package com.paging.controller;

import com.paging.model.StudentModel;
import com.paging.repository.StudentRepo;
import com.paging.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class StudentController {

    @Autowired
    private StudentServices  studentServices;
    @GetMapping(value = "/Students")
    public ResponseEntity<List<StudentModel>> getAllStudents(@RequestParam(defaultValue = "0") Integer pageNo,
                                             @RequestParam(defaultValue = "10") Integer pageSize,
                                             @RequestParam(defaultValue = "rollNo") String sortBy){

        List<StudentModel> list = studentServices.getAllStudents(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<StudentModel>>(list, new HttpHeaders(), HttpStatus.OK);
    }

}
