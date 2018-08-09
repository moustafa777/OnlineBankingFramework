package com.mum.asd.OnlineBankingFramework.register;

import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.User;

public interface IRegister {

    public void createUser(User user);
    
    public void createBill();
    
    public void createAccount();


}
