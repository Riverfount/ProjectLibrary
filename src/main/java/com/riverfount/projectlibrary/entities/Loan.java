package com.riverfount.projectlibrary.entities;

import java.time.Instant;

public class Loan {
    private Long id;
    private Instant loanDate;
    private Instant dueDate;
    private Instant returnDate;
    private Book book;
    private User user;
    private Integer loanStatus;
}
