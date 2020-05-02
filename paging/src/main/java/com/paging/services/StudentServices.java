package com.paging.services;

import com.paging.model.StudentModel;
import com.paging.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo studentRepo;

    public List<StudentModel> getAllStudents(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging =  PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<StudentModel> pagedResult = studentRepo.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<StudentModel>();
        }
    }

}
