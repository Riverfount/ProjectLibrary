package com.riverfount.projectlibrary.entities;

import com.riverfount.projectlibrary.entities.enums.ReservationStatus;

import java.time.Instant;

public class Reservation {
    private Long id;
    private User user;
    private Instant reservationDate;
    private Book book;
    private Integer status;

    public Reservation() {
    }

    public Reservation(Long id, User user, Instant reservationDate, Book book, ReservationStatus status) {
        this.id = id;
        this.user = user;
        this.reservationDate = reservationDate;
        this.book = book;
        setReservationStatus(status);
    }

    public ReservationStatus getReservationStatus() {
        return ReservationStatus.valueOf(status);
    }

    public void setReservationStatus(ReservationStatus ReservationStatus) {
        if (ReservationStatus != null) {
            this.status = ReservationStatus.getCode();
        }

    }
}
