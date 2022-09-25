package com.tempProjectBackend.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.tempProjectBackend.models.Order;
import com.tempProjectBackend.payload.OrderDTO;
import com.tempProjectBackend.service.OrderService;

@RestControllerAdvice
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping("/customer/{customerid}/helper/{helperid}/create")
	public ResponseEntity<OrderDTO> createOrder(
			@RequestBody OrderDTO orderdto,
			@PathVariable Integer customerid,
			@PathVariable Integer helperid)
	{
		
		OrderDTO neworder = orderService.createOrder(orderdto, customerid, helperid);
		return new ResponseEntity<OrderDTO>(neworder,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<OrderDTO>> getAllOrders()
	{
		return new ResponseEntity<List<OrderDTO>>(this.orderService.getAllOrders(),HttpStatus.OK);
	}
	
	
	@GetMapping("/customer/{customerid}/orders")
	public ResponseEntity<List<OrderDTO>> getOrdersByCustomers(@PathVariable Integer customerid)
	{
		List<OrderDTO> orderdtos = this.orderService.getOrdersByCustomer(customerid);
		return new ResponseEntity<List<OrderDTO>>(orderdtos,HttpStatus.OK);
	}
	
	@GetMapping("/helper/{helperid}/orders")
	public ResponseEntity<List<OrderDTO>> getOrdersByHelpers(@PathVariable Integer helperid)
	{
		List<OrderDTO> orderdtos = this.orderService.getOrdersByHelper(helperid);
		return new ResponseEntity<List<OrderDTO>>(orderdtos,HttpStatus.OK);
	}
	
	
}
