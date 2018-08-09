package com.mum.asd.OnlineBankingFramework.register;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mum.asd.OnlineBankingFramework.models.Address;
import com.mum.asd.OnlineBankingFramework.models.User;

@Component
public class UserRegisterFactory implements RegisterFactory {
    User user;
    Address address;
   // UserRepository userRepo;
    public UserRegisterFactory() {
      //  userRepo=UserRepository.getInstance();
    }

    @Override
    public void createUser(String name, String pass, Address s){

       /* switch (type) {
            case "CLIENT": {
                user=new Client(name,pass,false,s,b);
                userRepo.addUser(user);
                break;
            }
            case "ADMIN": {
                user=  user=new Admin(name,pass,true);
                userRepo.addUser(user);
                break;
            }
        }*/

    }

}
