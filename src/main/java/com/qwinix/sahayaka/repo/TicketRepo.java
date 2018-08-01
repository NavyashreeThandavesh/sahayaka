package com.qwinix.sahayaka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qwinix.sahayaka.model.Tickets;

@Repository("ticketRepo")
public interface TicketRepo extends JpaRepository<Tickets, Integer>{
//	Tickets findByPhoneNum(String phoneNumber);
}

