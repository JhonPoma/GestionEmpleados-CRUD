package com.employeemanager.ems_backend.mapper;

import com.employeemanager.ems_backend.dto.EmployeeDto;
import com.employeemanager.ems_backend.entity.Employee;

public class EmployeeMapper {


    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
        );
    }

    public static  Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
