package com.ali.spring.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ali.spring.mongodb.model.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    
}
