package com.ali.spring.mongodb.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ali.spring.mongodb.model.Expense;
import com.ali.spring.mongodb.repository.ExpenseRepository;

@Service

public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService( ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    
    public void addExpense( Expense expense) {
        expenseRepository.insert(expense);
    }

    public void updateadd() {
    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

    public void getExpenseByName() {
    }

    public void deleteExpense() {
    }
    
}
