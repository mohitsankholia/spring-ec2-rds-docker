package com.mohit.springec2docker.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.springec2docker.entity.Department;
import com.mohit.springec2docker.exceptions.CustomExceptions;
import com.mohit.springec2docker.repository.DepartmentRespository;
import com.mohit.springec2docker.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRespository departmentRespository;

	@Override
	public void saveDepartment(Department employee) {
		departmentRespository.save(employee);

	}

	@Override
	public Department findDepartmentById(Integer id) throws CustomExceptions {

		Optional<Department> departmentOpt = departmentRespository.findById(id);

		if (!departmentOpt.isPresent()) {
			throw new CustomExceptions();
		}
		return departmentRespository.findById(id).get();

	}

	@Override
	public void deleteDepartmentById(Integer id) {

		departmentRespository.deleteById(id);

	}

	@Override
	public void updateDepartment(Department employee) {
		departmentRespository.save(employee);

	}

	@Override
	public List<Department> listOfDepartments() {

		return departmentRespository.findAll();
	}

	@Override
	public List<Department> findDepartmentByName(String name) {

		return departmentRespository.findByName(name);
	}

}
