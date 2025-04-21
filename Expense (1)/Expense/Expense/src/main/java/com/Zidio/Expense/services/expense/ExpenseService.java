package com.Zidio.Expense.services.expense;


import com.Zidio.Expense.entity.Expense;
import com.Zidio.Expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
   @Autowired
   private ExpenseRepository expenseRepository;

   public List<Expense> getExpensesByDepartment(Integer departmentId) {
      return expenseRepository.findByDepartmentId(departmentId);
   }
}


