package com.user.demo.services;

import java.util.List;

import com.user.demo.model.Invoice;

public interface InvoiceService {

	public List<Invoice> getAllInvoices();
	
	public Invoice saveInvoice(Invoice invoice);
}
