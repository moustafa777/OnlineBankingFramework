package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.ServiceFactory;
import com.mum.asd.OnlineBankingFramework.services.authentication.UserProxyAuthentication;
import com.mum.asd.data.DataBase;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute User user, Model model) {

		UserProxyAuthentication userProxy = new UserProxyAuthentication();

		if (userProxy.IsAuthenticated(user.getUserName(), user.getPassword()) != null) {
			User currentUser =ServiceFactory.getUserService().findUser(user.getUserName(), user.getPassword());
			DataBase.getInstance().setCurrentUser(currentUser);
			return "redirect:/";
		} else {
			model.addAttribute("error", "User Name or Password is wrong");
			return "login";
		}

	}
}
