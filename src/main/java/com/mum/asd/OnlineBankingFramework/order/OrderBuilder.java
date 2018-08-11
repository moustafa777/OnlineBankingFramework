package com.mum.asd.OnlineBankingFramework.order;

import java.util.List;
import java.util.Random;

import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.Item;
import com.mum.asd.OnlineBankingFramework.models.User;

public class OrderBuilder implements IOrderBuilder {
	private Order order;

	@Override
	public void buildOrderDetails(User client) {
		Random rand = new Random();
		order.setId(rand.nextInt());
		order.setClient(client);
	}

	@Override
	public void buildOrderItems(List<Item> items) {
		order.setItems(items);
	}

	@Override
	public void buildShippingDetails(Address shippingAddress) {
		order.setShippingAddress(shippingAddress);
	}

	@Override
	public Order getOrder() {
		return order;
	}

	@Override
	public Order saveOrder() {
		return null;
	}

}
