package com.prashant.departmentservice.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.departmentservice.entity.Department;
import com.prashant.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentService.class);
	
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
