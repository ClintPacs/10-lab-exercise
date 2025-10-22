package com.appdev.furluv.pacanag3.service;

import com.appdev.furluv.pacanag3.entity.TransactionEntity;
import com.appdev.furluv.pacanag3.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public TransactionEntity getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public TransactionEntity createTransaction(TransactionEntity transaction) {
        return transactionRepository.save(transaction);
    }

    public TransactionEntity updateTransaction(Long id, TransactionEntity newTransaction) {
        TransactionEntity existing = transactionRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setDate(newTransaction.getDate());
            existing.setAmount(newTransaction.getAmount());
            existing.setStatus(newTransaction.getStatus());
            return transactionRepository.save(existing);
        }
        return null;
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
