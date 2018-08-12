package com.mum.asd.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.ServiceFactory;
import com.mum.asd.OnlineBankingFramework.validation.RangeValidator;
import com.mum.asd.OnlineBankingFramework.validation.RequiredFieldValidator;
import com.mum.asd.OnlineBankingFramework.validation.UserExistingValidator;
import com.mum.asd.OnlineBankingFramework.validation.models.Request;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute User user,Model model) {
        List<String> errList =new ArrayList<String>();

       //Validation change of responsibilities
        //Validation for UserName
        Request request = new Request();
        request.setControlName("UserName");
        request.setValue(user.getName());

        RequiredFieldValidator requiredVali =new RequiredFieldValidator();
        requiredVali.validate(request);

        if(!request.isValid())
            errList.add(request.getError());

        //Validation for Password
        request.setControlName("Password");
        request.setValue(user.getPassword());

        RangeValidator rangeVali =new RangeValidator(4);

        requiredVali.setNextValidator(rangeVali);
        requiredVali.validate(request);
        if(!request.isValid())
            errList.add(request.getError());
       
        request.setControlName("email");
        request.setValue(user.getEmail());

        
        UserExistingValidator userExistingValidator = new UserExistingValidator(user);
        userExistingValidator.validate(request);
        
        if(!request.isValid())
            errList.add(request.getError());

        if(errList.size()>0) {
            model.addAttribute("errors", errList);
            return "register";
        } else{
        	ServiceFactory.getUserService().createUSer(user);
            return "redirect:/";
        }
         
       
        


	}
}
