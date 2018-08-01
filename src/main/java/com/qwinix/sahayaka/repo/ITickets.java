package com.qwinix.sahayaka.repo;

import com.qwinix.sahayaka.model.Ticket;

public interface ITickets {
	Ticket getAllDetails(int id);
//	Tickets findByPhoneNum(int id);
	Ticket createTicket(int id);
	Ticket updateTicket(int id);
}
