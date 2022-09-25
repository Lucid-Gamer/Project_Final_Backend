package com.tempProjectBackend.payload;


public class OrderDTO {
	
	private String OrderID;
	
	private String OrderRemarks;
	
	private CustomerDTO customer;
	
	private HelperDTO helper;
	
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public OrderDTO(String orderID, String orderRemarks, CustomerDTO customer,
			HelperDTO helper) {
		super();
		OrderID = orderID;
		OrderRemarks = orderRemarks;
		this.customer = customer;
		this.helper = helper;
	}

	

	public String getOrderID() {
		return OrderID;
	}



	public void setOrderID(String orderID) {
		OrderID = orderID;
	}



	public String getOrderRemarks() {
		return OrderRemarks;
	}



	public void setOrderRemarks(String orderRemarks) {
		OrderRemarks = orderRemarks;
	}



	public CustomerDTO getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public HelperDTO getHelper() {
		return this.helper;
	}

	public void setHelper(HelperDTO helper) {
		this.helper = helper;
	}
	
	
	
}
