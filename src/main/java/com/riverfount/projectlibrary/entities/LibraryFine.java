package com.riverfount.projectlibrary.entities;

import java.time.Instant;

public class LibraryFine {
    private Long id;
    private Double amount;
    private String reason;
    private Instant fineAssessmentDate;
    private boolean payed;
}
