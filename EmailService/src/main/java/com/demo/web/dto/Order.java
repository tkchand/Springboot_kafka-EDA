package com.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {

	    private String orderId;
	    private String name;
	    private int qty;
	    private double price;
}
