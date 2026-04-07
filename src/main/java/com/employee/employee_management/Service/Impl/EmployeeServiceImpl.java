package com.employee.employee_management.Service.Impl;

import com.employee.employee_management.Dto.EmployeeDto;
import com.employee.employee_management.Entity.Employee;
import com.employee.employee_management.Repository.EmployeeRepository;
import com.employee.employee_management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = mapToEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee); // Save the employee entity to the database using your repository
        EmployeeDto employeeDto1 = mapToDto(savedEmployee);
        return employeeDto1;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return List.of();
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDto employeeDto) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }
    private EmployeeDto mapToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setDepartment(employee.getDepartment());
        employeeDto.setName(employee.getName());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setMobile(employee.getMobile());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setCity(employee.getCity());
        return employeeDto;
    }
    private Employee mapToEntity(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setDepartment(employeeDto.getDepartment());
        employee.setName(employeeDto.getName());
        employee.setEmail(employeeDto.getEmail());
        employee.setMobile(employeeDto.getMobile());
        employee.setSalary(employeeDto.getSalary());
        employee.setCity(employeeDto.getCity());
        return employee;
    }
}
