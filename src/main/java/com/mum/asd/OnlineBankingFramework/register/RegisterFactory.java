package com.mum.asd.OnlineBankingFramework.register;

public class RegisterFactory {

	public IRegister getRegister(String type) {
		
		if(type == "user") {
			
			return new UserRegister();
		}
		
		
		return null;
		
	}
}
