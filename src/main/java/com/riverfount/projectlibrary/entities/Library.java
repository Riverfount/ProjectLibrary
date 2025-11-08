package com.riverfount.projectlibrary.entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
}
