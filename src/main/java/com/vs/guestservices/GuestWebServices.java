package com.vs.guestservices;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
@RequiredArgsConstructor
@Data
public class GuestWebServices {

    private final GuestRepository repository;

    @GetMapping
    public Iterable<Guest> getAllGuests() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable long id) {
        return repository.findById(id).get();
    }
}
