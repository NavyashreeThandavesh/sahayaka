package com.qwinix.sahayaka.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.sahayaka.model.Ticket;
import com.qwinix.sahayaka.repo.TicketRepo;

@Service
public class TicketService {
	@Autowired
	TicketRepo ticketRepo;

	public List<Ticket> getAllDetails() {
		List<Ticket> tickets = new ArrayList<>();
		List<String> status = new ArrayList<String>();
		status.add("OPEN");
		tickets = ticketRepo.findAllByStatus(status);
		return tickets;
	}

//	public Tickets findByPhoneNum(String phoneNumber) {
//		return ticketRepo.findByPhoneNum(phoneNumber);
//	}

	public Ticket createTicket(Ticket addticket) {
		Ticket createdTicket = ticketRepo.save(addticket);
		return createdTicket;
	}

	public Ticket updateTicket(Ticket ticketDetails) {
		Ticket updateTicket = ticketRepo.save(ticketDetails);
		return updateTicket;
	}
}
