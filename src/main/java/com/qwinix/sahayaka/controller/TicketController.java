package com.qwinix.sahayaka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qwinix.sahayaka.model.Tickets;
import com.qwinix.sahayaka.service.TicketService;

@RestController
@EnableAutoConfiguration
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/getAllTickets")
	public List<Tickets> getAllTickets() {
		return  ticketService.getAllDetails();
	}
	
//	@GetMapping("/getPhoneNumberDetails/{phoneNumber}")
//	public Tickets getTicketByPhoneNum(@PathVariable String phoneNumber) {
//		return ticketService.findByPhoneNum(phoneNumber);
//	}
	
	@PostMapping("/createTicket")
	public void createTicket(@RequestBody Tickets addticket) {
		ticketService.createTicket(addticket);
	}
	
	@PutMapping("/getAllTickets/{id}")
	public void updateUser(@RequestBody Tickets ticketDetails) {
		ticketService.updateTicket(ticketDetails);
	}
	
}
