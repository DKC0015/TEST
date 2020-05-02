package com.paging.repository;

import com.paging.model.StudentModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface StudentRepo extends PagingAndSortingRepository<StudentModel, Integer> {
}
