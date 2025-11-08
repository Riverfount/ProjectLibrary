package com.riverfount.projectlibrary.entities.enums;

public enum LoanStatus {
    CHECKED_OUT(1),
    ON_LOAN(2),
    OVERDUE(3),
    RETURNED(4),
    LOST(5);

    private final int code;

    LoanStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static LoanStatus valueOf(int code) {
        for (LoanStatus status : LoanStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException(String.format("Loan status with code %d does not exist", code));
    }

}
