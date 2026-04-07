package com.employee.employee_management.Controller;


import com.employee.employee_management.Dto.EmployeeDto;
import com.employee.employee_management.Entity.Employee;
import com.employee.employee_management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //http://localhost:8085/api/employees/create
    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto createdEmployee = employeeService.saveEmployee(employeeDto);
        return ResponseEntity.ok(createdEmployee);
    }
}
