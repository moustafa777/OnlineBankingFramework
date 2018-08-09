package com.mum.asd.OnlineBankingFramework.register;


import org.springframework.stereotype.Component;
import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.User;

@Component
public class UserRegister implements IRegister {
    User user;
    Address address;
   // UserRepository userRepo;
    public UserRegister() {
      //  userRepo=UserRepository.getInstance();
    }
    
    
	@Override
	public void createUser(User user) {
		
		
	// call facade service
	}


	@Override
	public void createBill() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}


	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	

    

}
