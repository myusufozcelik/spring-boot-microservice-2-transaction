package com.sha.springbootmicroservice2transaction.controller;

import com.sha.springbootmicroservice2transaction.model.Transaction;
import com.sha.springbootmicroservice2transaction.service.ITransactionService;
import com.sha.springbootmicroservice2transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @GetMapping
    public ResponseEntity<?> getAllTransaction() {
        return ResponseEntity.ok(transactionService.findAll());
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllTransactionOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionService.findAllTransactionOfUser(userId));
    }

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId) {
        return new ResponseEntity<>(transactionService.deleteTransaction(transactionId), HttpStatus.OK);
    }


}
