package com.qwinix.sahayaka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.sahayaka.model.Tickets;
import com.qwinix.sahayaka.repo.TicketRepo;

@Service
public class TicketService {
	@Autowired
	TicketRepo ticketRepo;

	public List<Tickets> getAllDetails() {
		List<Tickets> tickets = new ArrayList<>();
		tickets = ticketRepo.findAll();
		return tickets;
	}

//	public Tickets findByPhoneNum(String phoneNumber) {
//		return ticketRepo.findByPhoneNum(phoneNumber);
//	}

	public Tickets createTicket(Tickets addticket) {
		Tickets ticketcreate = ticketRepo.save(addticket);
		return ticketcreate;
	}

	public Tickets updateTicket(Tickets ticketDetails) {
		Tickets updateTicket = ticketRepo.save(ticketDetails);
		return updateTicket;
	}
}
