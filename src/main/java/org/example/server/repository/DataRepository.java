package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "John", "555-04-54"));
        list.add(new Contact(2, "Jane", "553-55-01"));
        list.add(new Contact(3, "Jake", "598-56-17"));
        return list;
    }
}