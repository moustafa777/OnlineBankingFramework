package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.asd.OnlineBankingFramework.models.Account;
import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.data.DataBase;

@Controller
public class ProfileController {
	
//	@GetMapping("/profile")
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String loadProfile(Model model) {
		User user = new User();
		user = DataBase.getInstance().getCurrentUser();
		model.addAttribute("user", user);
		return "profile";
	}

	@PostMapping("/profile")
	public String updateProfile(@ModelAttribute User user, Model model) {
		
		User updatedUser = DataBase.getInstance().getCurrentUser();
		updatedUser.setEmail(user.getEmail());
		updatedUser.setName(user.getName());
		updatedUser.setPassword(user.getPassword());
		DataBase.getInstance().setCurrentUser(updatedUser);
		

		return "profile";

	}

}
