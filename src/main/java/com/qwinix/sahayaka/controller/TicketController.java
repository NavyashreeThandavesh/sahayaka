package com.qwinix.sahayaka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qwinix.sahayaka.ValidationException;

import com.qwinix.sahayaka.model.Ticket;
import com.qwinix.sahayaka.model.TicketRetVal;
import com.qwinix.sahayaka.service.TicketService;

@RestController
@EnableAutoConfiguration
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets() {
		return  ticketService.getAllDetails();
	}
	
//	@GetMapping("/getPhoneNumberDetails/{phoneNumber}")
//	public Tickets getTicketByPhoneNum(@PathVariable String phoneNumber) {
//		return ticketService.findByPhoneNum(phoneNumber);
//	}
	
	@PostMapping("/createTicket")
	public TicketRetVal createTicket(@RequestBody Ticket addticket) {
		ResponseEntity<TicketRetVal> returnVal = null;
		TicketRetVal retVal = new TicketRetVal();
		try {
			addticket = ticketService.createTicket(addticket);
			retVal.setMessage("Ticket Created");
			retVal.setStatus("OPEN");
			returnVal = ResponseEntity.ok().body(retVal);
		}
		catch(ValidationException ve) {
			retVal.setMessage(ve.getMessage());
			retVal.setStatus("false");
			returnVal = ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(retVal);
		}		
		return retVal;
	}
	
	@PutMapping("/getAllTickets/{id}")
	public void updateUser(@RequestBody Ticket ticketDetails) {
		ticketService.updateTicket(ticketDetails);
	}
	
}
