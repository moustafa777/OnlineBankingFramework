package com.mum.asd.OnlineBankingFramework.register;

import com.mum.asd.OnlineBankingFramework.models.Address;

public interface RegisterFactory {

    public void createUser(String name, String pass, Address s);


}
