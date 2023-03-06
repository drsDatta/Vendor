package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Entities.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>
{
	
	
	
}
