package com.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="Vendor")
@Data
public class Vendor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vendor_id;
	@NotNull
	private String vendor_name;
	@Column(unique = true)
	private int vendor_code;
	@NotNull
	private String address;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@Size(min = 6, max = 6)
	private int pincode;
	@Size(min = 10, max = 10)
	private String phone;
	@Column(unique = true, nullable = false)
	private String email;
	
	
}
