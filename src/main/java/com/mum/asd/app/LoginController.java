package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.authentication.UserProxyAuthentication;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam(name = "name", required = true) String username,
			@RequestParam(name = "password", required = true) String password, Model model) {
		return "redirect:/index.html";
//		UserProxyAuthentication userProxy = new UserProxyAuthentication();
//		String page = userProxy.getUserAccesssPage(user);
//		if (page.length() == 0) {
//			model.addAttribute("error", "User Name or Password is wrong");
//			return "login";
//
//		} else
//			return "redirect:/" + page;

	}
}
