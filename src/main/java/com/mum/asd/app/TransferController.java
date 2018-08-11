package com.mum.asd.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;

@Controller
public class TransferController {

	@GetMapping("/transfer")
	public String login(Model model) {
		model.addAttribute("destinationAccount", new Account());
		return "login";
	}

	@PostMapping("/transfer")
	public String transfer(@ModelAttribute User user, Model model, HttpServletRequest httpServletRequest) {
		return null;

	}

}
