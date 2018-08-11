package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.IUserService;
import com.mum.asd.OnlineBankingFramework.services.ServiceFactory;
import com.mum.asd.OnlineBankingFramework.services.authentication.UserProxyAuthentication;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute User user,Model model) {
		
		ServiceFactory.getUserService().createUSer(user);
		  return "redirect:/";
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
