package com.services;

import java.util.List;

import com.Entities.Vendor;
import com.Repo.VendorRepo;

public interface VendorService {
	public Vendor addVendor(VendorRepo repo,Vendor v);
	public List<Vendor> getVendor(VendorRepo repo);
	public Vendor getById(VendorRepo repo,int id);
	public String removeId(VendorRepo repo,int id);
	public Vendor updateVendor(VendorRepo repo,Vendor v,int id );
}
