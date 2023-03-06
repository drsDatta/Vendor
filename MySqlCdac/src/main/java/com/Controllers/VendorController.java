package com.Controllers;

import java.util.List;

import com.Entities.Vendor;
import com.Repo.VendorRepo;
import com.services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController
{
	@Autowired
	VendorRepo repo;
	@Autowired
	ServiceImpl empl;
	@PostMapping("/newEmployee")
	public Vendor addNewVendor(@RequestBody Vendor v) {
		return this.empl.addVendor(repo, v);
	}
	
	@GetMapping("/show")
	public List<Vendor> listOfVendor(){
		return this.empl.getVendor(repo);
	}
	@RequestMapping("/getVendor/{id}")
	public Vendor getVendorById(@PathVariable String id) {
		return this.empl.getById(repo, Integer.parseInt(id));
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteVendor(@PathVariable String id) {
		if(id!=null) {
			return this.empl.removeId(repo, Integer.parseInt(id));
		}else {
			return "Null Value";
		}
	}
	
	@PutMapping("/update/{id}")
	public Vendor updateVendorById(@RequestBody Vendor v,@PathVariable String id) {
		return this.empl.updateVendor(repo, v, Integer.parseInt(id));
	}
	
	
	
	
}	
