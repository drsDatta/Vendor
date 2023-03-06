package com.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Entities.Vendor;
import com.Repo.VendorRepo;

public class ServiceImpl implements VendorService{
	List<Vendor>list;
	Vendor old;
	@Autowired
	VendorRepo repo;
	@Override
	public Vendor addVendor(VendorRepo repo, Vendor v) {
		repo.save(v);	
		return v;
	}

	@Override
	public List<Vendor> getVendor(VendorRepo repo) {
		Iterable<Vendor>itr=repo.findAll();
		Iterator<Vendor>it=itr.iterator();
		while(it.hasNext()) {
			Vendor v=it.next();
			list.add(v);
		}
		return list;
	}

	@Override
	public Vendor getById(VendorRepo repo, int id) {
		Optional<Vendor>op=repo.findById(id);
		Vendor v=op.get();
		return v;
	}

	@Override
	public String removeId(VendorRepo repo, int id) {
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Vendor updateVendor(VendorRepo repo, Vendor v, int id) {
		Optional<Vendor>op=repo.findById(id);
		op.get();
		old.setVendor_id(v.getVendor_id());
		old.setVendor_name(v.getVendor_name());
		old.setVendor_code(v.getVendor_code());
		old.setAddress(v.getAddress());
		old.setCity(v.getCity());
		old.setState(v.getState());
		old.setPincode(v.getPincode());
		old.setPhone(v.getPhone());
		old.setEmail(v.getEmail());
		repo.save(old);
		return old;
	}

}
