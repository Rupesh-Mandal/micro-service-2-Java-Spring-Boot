package com.rupesh_mandal.department_service.controller;

import com.rupesh_mandal.department_service.dto.ResponseMessage;
import com.rupesh_mandal.department_service.entity.Department;
import com.rupesh_mandal.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    ResponseEntity<ResponseMessage> addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping("/get")
    List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/get/{departmentId}")
    Department getDepartmentForDepartmentId(@PathVariable("departmentId") Long departmentId){
        return departmentService.getDepartmentForDepartmentId(departmentId);
    }

}
