/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan5;

/**
 *
 * @author Hieu
 */
public class Employee {
    private int id;
    private String name;
    private String type;
    private String address;
    private String contact;
    private String email;
    private String remarks;
    public Employee(){
    }

    public Employee(int id, String name, String type, String address, String contact, String email, String remarks) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
}
