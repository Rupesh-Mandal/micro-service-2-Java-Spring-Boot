package com.rupesh_mandal.department_service.service;

import com.rupesh_mandal.department_service.dto.ResponseMessage;
import com.rupesh_mandal.department_service.entity.Department;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentService {

    ResponseEntity<ResponseMessage> addDepartment(Department department);
    List<Department> getAllDepartment();
    Department getDepartmentForDepartmentId(Long departmentId);

}
