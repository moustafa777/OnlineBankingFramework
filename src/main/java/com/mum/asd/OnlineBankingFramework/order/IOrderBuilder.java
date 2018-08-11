package com.mum.asd.OnlineBankingFramework.order;

import java.util.List;

import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.Item;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface IOrderBuilder {

	public void buildOrderDetails(User client);

	public void buildOrderItems(List<Item> items);

	public void buildShippingDetails(Address shippingAddress);

	public Order getOrder();

	public Order saveOrder();
}
