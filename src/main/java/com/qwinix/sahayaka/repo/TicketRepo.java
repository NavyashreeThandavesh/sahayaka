package com.qwinix.sahayaka.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.sahayaka.model.Ticket;

@Repository("ticketRepo")
public interface TicketRepo extends JpaRepository<Ticket, Integer>{
//	Tickets findByPhoneNum(String phoneNumber);
	List<Ticket> findAllByStatus(List<String> status);
}

