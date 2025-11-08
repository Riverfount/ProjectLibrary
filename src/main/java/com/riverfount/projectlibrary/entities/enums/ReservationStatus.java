package com.riverfount.projectlibrary.entities.enums;

public enum ReservationStatus {
    PENDING(1),
    WAITING_LIST(2),
    READY_FOR_PICKUP(3),
    COLLECTED(4),
    CANCELLED(5),
    EXPIRED(6);

    private final Integer code;

    ReservationStatus(Integer code) {
        this.code = code;
    }

    ReservationStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ReservationStatus valueOf(int code) {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException(String.format("Loan status with code %d does not exist", code));
    }
}
