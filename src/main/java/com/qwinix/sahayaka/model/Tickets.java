package com.qwinix.sahayaka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Tickets {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;

	@Column(name = "phoneNumber") private String phoneNumber;
	@Column(name = "name") private String name;
	@Column(name = "aadharNumber") private String aadharNumber;
	@Column(name = "distName") private String distName;
	@Column(name = "talukName") private String talukName;
	@Column(name = "villageName") private String villageName;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getTalukName() {
		return talukName;
	}
	public void setTalukName(String talukName) {
		this.talukName = talukName;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

}
