package com.tempProjectBackend.payload;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerDTO {
	
	private int CustomerID;
	
	@NotEmpty
	private String CustomerName;
	
	@DateTimeFormat
	private Date DOB;
	
	@NotEmpty
	private String CustomerContact;
	
	@NotEmpty
	private String CustomerAddress;
	
	@Email
	private String CustomerEmailID;
	
	@NotEmpty
	public String CustomerGender;
	
	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getCustomerContact() {
		return CustomerContact;
	}

	public void setCustomerContact(String customerContact) {
		CustomerContact = customerContact;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerEmailID() {
		return CustomerEmailID;
	}

	public void setCustomerEmailID(String customerEmailID) {
		CustomerEmailID = customerEmailID;
	}

	public String getCustomerGender() {
		return CustomerGender;
	}

	public void setCustomerGender(String customerGender) {
		CustomerGender = customerGender;
	}
	
	
}
