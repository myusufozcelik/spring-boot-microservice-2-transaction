package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    String deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionOfUser(Long userId);

    List<Transaction> findAll();
}
