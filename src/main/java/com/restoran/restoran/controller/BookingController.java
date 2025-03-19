package com.restoran.restoran.controller;

import com.restoran.restoran.dto.BookingRequestDto;
import com.restoran.restoran.entity.BookingEntity;
import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.service.BookingService;
import com.restoran.restoran.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<BookingEntity> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public BookingEntity addBooking(@RequestBody BookingRequestDto booking) {
        return bookingService.addBooking(booking);
    }
}
