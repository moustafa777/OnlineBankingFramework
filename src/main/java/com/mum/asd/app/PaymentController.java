package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mum.asd.OnlineBankingFramework.models.Bill;
import com.mum.asd.OnlineBankingFramework.services.IAccountService;
import com.mum.asd.OnlineBankingFramework.services.ServiceFactory;

@Controller
public class PaymentController {

	@GetMapping("/payment")
	public String payment(Model model) {
		model.addAttribute("bill", new Bill());
		return "payment";
	}

	@PostMapping("/payment")
	public String payment(@ModelAttribute Bill bill, Model model) {

		IAccountService accountService = ServiceFactory.getAccountService();
		bill.setBillAmount(200);
		accountService.payBill(bill);

		model.addAttribute("paid", "Bill paid successfully");
		return "payment";
	}

}
