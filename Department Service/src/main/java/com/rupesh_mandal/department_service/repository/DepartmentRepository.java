package com.rupesh_mandal.department_service.repository;

import com.rupesh_mandal.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
