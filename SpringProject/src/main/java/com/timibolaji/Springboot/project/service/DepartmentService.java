package com.timibolaji.Springboot.project.service;

import com.timibolaji.Springboot.project.entity.Department;
import com.timibolaji.Springboot.project.exception.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound;

   public void deleteDepartmentById(Long departmentId);

   public  Department updateDepartment(Long departmentId, Department department);

  public  Department fetchDepartmentByName(String departmentName);
}
