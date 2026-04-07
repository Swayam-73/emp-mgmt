package com.employee.employee_management.Service;

import com.employee.employee_management.Dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
        EmployeeDto saveEmployee(EmployeeDto employeeDto);
        List<EmployeeDto> getAllEmployees();
        EmployeeDto getEmployeeById(Long id);
        void updateEmployee(EmployeeDto employeeDto);
        void deleteEmployee(Long id);
}
