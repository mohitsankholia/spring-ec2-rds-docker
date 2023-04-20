package com.mohit.springec2docker.service;

import java.util.List;

import com.mohit.springec2docker.entity.Department;
import com.mohit.springec2docker.exceptions.CustomExceptions;

public interface DepartmentService {

	void saveDepartment(Department employee);

	void updateDepartment(Department employee);

	Department findDepartmentById(Integer id) throws CustomExceptions;

	void deleteDepartmentById(Integer id);

	List<Department> listOfDepartments();

	List<Department> findDepartmentByName(String name);

}
