package com.mum.asd.OnlineBankingFramework.order;

import java.util.List;

import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.Item;
import com.mum.asd.OnlineBankingFramework.models.User;

public class OrderDirector {

	private IOrderBuilder orderBuilder = null;

	public OrderDirector(IOrderBuilder orderBuilder) {
		this.orderBuilder = orderBuilder;
	}

	public void constructOrder(User client, Address shippingAddress, List<Item> items) {
		orderBuilder.buildOrderDetails(client);
		orderBuilder.buildOrderItems(items);
		orderBuilder.buildShippingDetails(shippingAddress);

	}

	public Order getOrder() {
		return orderBuilder.getOrder();
	}

}
