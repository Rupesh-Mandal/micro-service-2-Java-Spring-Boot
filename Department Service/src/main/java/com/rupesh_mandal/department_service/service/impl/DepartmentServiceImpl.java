package com.rupesh_mandal.department_service.service.impl;

import com.rupesh_mandal.department_service.dto.ResponseMessage;
import com.rupesh_mandal.department_service.entity.Department;
import com.rupesh_mandal.department_service.repository.DepartmentRepository;
import com.rupesh_mandal.department_service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public ResponseEntity<ResponseMessage> addDepartment(Department department) {
        department.setDepartmentId(null);
        departmentRepository.save(department);
        log.info("Saving department");
        return new ResponseEntity<>(new ResponseMessage("Succfully cretated"), HttpStatus.OK);
    }

    @Override
    public List<Department> getAllDepartment() {
        log.info("gettin all department");
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentForDepartmentId(Long departmentId) {
        log.info("getting " +departmentId+ "department");
        return departmentRepository.findById(departmentId).get();
    }
}
