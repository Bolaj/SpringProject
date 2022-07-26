package com.timibolaji.Springboot.project.controller;

import com.timibolaji.Springboot.project.entity.Department;
import com.timibolaji.Springboot.project.exception.DepartmentNotFound;
import com.timibolaji.Springboot.project.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/api/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/api/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartment of DepartmentController");
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/api/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFound {
        return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/api/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
       departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully..";
    }

    @PutMapping("/api/departments/{id}")
    public Department updateDepartment(@Valid @PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);

    }
    @GetMapping("/api/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }


}
