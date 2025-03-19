package com.restoran.restoran.service;

import com.restoran.restoran.dto.BookingRequestDto;
import com.restoran.restoran.entity.BookingEntity;
import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.repository.BookingRepository;
import com.restoran.restoran.repository.ChefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    public List<BookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    public BookingEntity addBooking(BookingRequestDto booking) {
        BookingEntity entity = new BookingEntity();
        entity.setDate(fromStringToDateTime(booking.getDate()));
        entity.setName(booking.getName());
        entity.setNotes(booking.getNotes());
        entity.setNumberOfPeople(booking.getNumberOfPeople());
        entity.setEmail(booking.getEmail());
        return bookingRepository.save(entity);
    }
    public LocalDateTime fromStringToDateTime(String dateString){
        return LocalDateTime.parse(dateString);
    }
}

