package com.riverfount.projectlibrary.entities;

import com.riverfount.projectlibrary.entities.enums.LoanStatus;

import java.time.Instant;

public class Loan {
    private Long id;
    private Instant loanDate;
    private Instant dueDate;
    private Instant returnDate;
    private Book book;
    private User user;
    private Integer loanStatus;

    public Loan() {
    }

    public Loan(Long id, Instant loanDate, Instant dueDate, Instant returnDate, Book book, User user, LoanStatus loanStatus) {
        this.id = id;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.book = book;
        this.user = user;
        setLoanStatus(loanStatus);
    }

    public LoanStatus getLoanStatus() {
        return LoanStatus.valueOf(loanStatus);
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        if (loanStatus != null) {
            this.loanStatus = loanStatus.getCode();
        }

    }
}
