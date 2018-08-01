package com.qwinix.sahayaka.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int ticketId;

	@Column(name = "name") private String name;
	@Column(name = "phoneNumber") private Long phoneNumber;
	@Column(name = "aadharNumber") private Long aadharNumber;
	@Column(name = "distName") private String distName;
	@Column(name = "talukName") private String talukName;
	@Column(name = "villageName") private String villageName;
	@Column(name = "category") private String category;
	@Column(name = "priority") private String priority;
	@Column(name = "details") private String details;
	@Column(name = "userId") private int userId;
	@Column(name = "status") private String status;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-mm-yyyy hh:mm:ss")
	@Column(name = "creationDateTime") private Date creationDateTime;
}
