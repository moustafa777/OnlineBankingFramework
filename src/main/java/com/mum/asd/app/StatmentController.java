package com.mum.asd.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.asd.OnlineBankingFramework.models.Transaction;
import com.mum.asd.data.DataBase;

@Controller
public class StatmentController {
	@RequestMapping(value = "/statment", method = RequestMethod.GET)
	public String loadStatment(Model model) {
		List<Transaction> transactions = new ArrayList<>();
		transactions = DataBase.getInstance().getCurrentUser().getAccount().getTransactions();
		model.addAttribute("transactions", transactions);
		return "statment";
	}

}
