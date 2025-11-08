package com.riverfount.projectlibrary.entities;

import java.time.Instant;

public class User {
    private Long id;
    private String name;
    private String CPF;
    private String address;
    private String phone;
    private String email;
    private Instant createdAt;
    private Instant updatedAt;
    private Integer activeLoans;
}
