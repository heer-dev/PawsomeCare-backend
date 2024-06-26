package com.example.capstone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "supportInquiries")
public class SupportInquiry {
    @Id
    private String id;
    private String email;
    private LocalDate date;
    private String inquiry;
    private String status;

    // Constructors, Getters, and Setters


    public SupportInquiry() {
    }

    public SupportInquiry(String id, String email, LocalDate date, String inquiry, String status) {
        this.id = id;
        this.email = email;
        this.date = date;
        this.inquiry = inquiry;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}