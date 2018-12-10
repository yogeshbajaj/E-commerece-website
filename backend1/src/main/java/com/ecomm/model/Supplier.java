package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
	@Id
	@GeneratedValue
	private int SupplierId;
	private String SupplierName;
	private String SupplierEmail;
	private int SupplierContact;
	private String SupplierAddress;
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierEmail() {
		return SupplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		SupplierEmail = supplierEmail;
	}
	public int getSupplierContact() {
		return SupplierContact;
	}
	public void setSupplierContact(int supplierContact) {
		SupplierContact = supplierContact;
	}
	public String getSupplierAddress() {
		return SupplierAddress;
	}
	public void setSupplierAddress(String string) {
		SupplierAddress = string;
	}

}
