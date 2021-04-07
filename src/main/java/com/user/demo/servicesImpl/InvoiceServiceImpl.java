package com.user.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.demo.model.Invoice;
import com.user.demo.repositories.InvoiceRepository;
import com.user.demo.services.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceRepository.save(invoice);
	}

}
