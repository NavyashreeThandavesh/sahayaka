package com.qwinix.sahayaka.repo;

import com.qwinix.sahayaka.model.Tickets;

public interface ITickets {
	Tickets getAllDetails(int id);
//	Tickets findByPhoneNum(int id);
	Tickets createTicket(int id);
	Tickets updateTicket(int id);
}
