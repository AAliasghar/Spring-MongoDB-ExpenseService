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

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }


    public void updateExpense(Expense expense){

        Expense storedExpense = expenseRepository.findById(expense.getId())
        .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by ID %s", expense.getId())));

        storedExpense.setExpenseName(expense.getExpenseName());
        storedExpense.setExpenseCategory(expense.getExpenseCategory());
        storedExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(expense);
    }
    

    public void getExpenseByName(String name) {
        expenseRepository.findByName(name)
        .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name %s", name)));
    }

    public void deleteExpense() {
    }
    
}
