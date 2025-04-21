package com.Zidio.Expense.repository;

import com.Zidio.Expense.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
