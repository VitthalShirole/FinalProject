package com.app.entites;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	
	private String state;
	
	private int zip;
}
