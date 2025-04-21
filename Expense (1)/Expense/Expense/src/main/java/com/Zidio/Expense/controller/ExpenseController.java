package com.Zidio.Expense.controller;

import com.Zidio.Expense.entity.Expense;
import com.Zidio.Expense.services.expense.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/{departmentId}")
    public List<Expense> getExpensesByDepartment(@PathVariable Integer departmentId) {
        return expenseService.getExpensesByDepartment(departmentId);
    }
}

