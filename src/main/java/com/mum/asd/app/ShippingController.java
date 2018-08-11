package com.mum.asd.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mum.asd.OnlineBankingFramework.models.Item;
import com.mum.asd.OnlineBankingFramework.models.ShippingInfo;
import com.mum.asd.OnlineBankingFramework.order.OrderBuilder;
import com.mum.asd.OnlineBankingFramework.order.OrderDirector;
import com.mum.asd.OnlineBankingFramework.shipping.FedexStrategy;
import com.mum.asd.OnlineBankingFramework.shipping.PackageShipping;
import com.mum.asd.OnlineBankingFramework.shipping.UpsStrategy;
import com.mum.asd.OnlineBankingFramework.shipping.UspsStrategy;

@Controller
@ControllerAdvice
public class ShippingController {
	String method = "x";

	@GetMapping("/statment-shippment")
	public String statmetShipment(Model model) {
		model.addAttribute("shippingInfo", new ShippingController());
		return "statment-shippment";
	}

	@PostMapping("/statment-shippment")
	public String ship(@ModelAttribute ShippingInfo shippingInfo, Model model) {
		PackageShipping pks = new PackageShipping();
		OrderDirector od = new OrderDirector(new OrderBuilder());
		double fee = 0.0;
		Item item = new Item("Statment Shipping", 1, fee);
		switch (shippingInfo.shippingMethod) {
		case "Fedex":
			pks.setStrategy(new FedexStrategy(100));
			fee = pks.calculateShippingFee();
			break;
		case "USPS":
			pks.setStrategy(new UspsStrategy(100));
			fee = pks.calculateShippingFee();
			break;
		case "UPS":
			pks.setStrategy(new UpsStrategy(100));
			fee = pks.calculateShippingFee();
			break;
		default:
			break;
		}
		
//		od.constructOrder(client, shippingAddress, items);
		
		
		
		
		
		
		
		return "redirect:/";

	}

}
