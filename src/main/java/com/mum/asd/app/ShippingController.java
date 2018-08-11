package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.services.ServiceFactory;
import com.mum.asd.OnlineBankingFramework.shipping.FedexStrategy;
import com.mum.asd.OnlineBankingFramework.shipping.PackageShipping;
import com.mum.asd.OnlineBankingFramework.shipping.UpsStrategy;
import com.mum.asd.OnlineBankingFramework.shipping.UspsStrategy;

@Controller
public class ShippingController {

	@GetMapping("/statment-shippment")
	public String statmetShipment(Model model) {
		return "statment-shippment";
	}

	@PostMapping("/statment-shippment")
	public String register(@RequestParam("mtdradio") String shippingMethod, Model model) {
		PackageShipping pks = new PackageShipping();
		switch (shippingMethod) {
		case "Fedex":
			FedexStrategy fedexStrategy = new FedexStrategy(100);
			pks.setStrategy(fedexStrategy);
			pks.calculateShippingFee();
			break;
		case "USPS":
			UspsStrategy uspsStrategy = new UspsStrategy(100);
			pks.setStrategy(uspsStrategy);
			pks.calculateShippingFee();
			break;
		case "UPS":
			UpsStrategy upsStrategy = new UpsStrategy(100);
			pks.setStrategy(upsStrategy);
			pks.calculateShippingFee();
			break;
		default:
			break;
		}
		
		return "redirect:/";

	}

}
