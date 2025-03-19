package com.restoran.restoran.dto;

import lombok.Getter;
import lombok.Setter;


public class BookingRequestDto {

    private String name;

    private String email;

    private String date;

    private Integer numberOfPeople;

    private String notes;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Integer getNumberOfPeople() { return numberOfPeople; }
    public void setNumberOfPeople(Integer numberOfPeople) { this.numberOfPeople = numberOfPeople; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
