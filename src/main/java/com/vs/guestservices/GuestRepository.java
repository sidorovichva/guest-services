package com.vs.guestservices;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
