package com.user.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.demo.model.Invoice;
import com.user.demo.model.LoginDetails;
import com.user.demo.services.InvoiceService;
import com.user.demo.services.LoginDetailsService;

@Controller
public class HomeController {

	@Autowired
	private LoginDetailsService loginDetailsService;

	@Autowired
	private InvoiceService invoiceService;

	@GetMapping(value = { "/", "/login" })
	public String login(Model model) {
		LoginDetails loginDetails = new LoginDetails();
		model.addAttribute("loginDetails", loginDetails);
		return "login";
	}

	@PostMapping("/validateUser")
	public String validateUser(@Valid LoginDetails loginDetails, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "login";
		} else {
			Optional<LoginDetails> loginObj = Optional
					.ofNullable(loginDetailsService.getLoginDetailsByUsername(loginDetails.getUserName()));
			if (loginObj.isPresent()) {
				if (loginObj.get().getPassword().equals(loginDetails.getPassword())
						&& loginObj.get().getActiveStatus().equals("Y")) {
					return "redirect:/invoiceListPage";
				}
			}
			return "login";
		}

	}

	@GetMapping("/invoiceListPage")
	public String getInfo(Model model) {
		List<Invoice> invList = invoiceService.getAllInvoices();
		model.addAttribute("list", invList);
		return "invoiceList";
	}

	@GetMapping("/addInvoice")
	public String addInvioce(Model model) {
		Invoice invoice = new Invoice();
		model.addAttribute("invoice", invoice);
		return "addInvoice";
	}

	@PostMapping("/saveInvoice")
	public String saveInvoice(Invoice invoice, Model model) {
		invoiceService.saveInvoice(invoice);
		return "redirect:/invoiceListPage";
	}

}
