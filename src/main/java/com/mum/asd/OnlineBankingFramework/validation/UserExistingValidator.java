package com.mum.asd.OnlineBankingFramework.validation;

import com.mum.asd.OnlineBankingFramework.models.User;
import com.mum.asd.OnlineBankingFramework.validation.models.Request;
import com.mum.asd.data.DataBase;

public class UserExistingValidator implements Validator {

	private Validator nextValidator;
	private User user;

	public UserExistingValidator(User user) {
		this.user = user;
	}

	@Override
	public void setNextValidator(Validator validator) {
		this.nextValidator = validator;
	}

	@Override
	public void validate(Request request) {
		request.setValid(true);

		for (User user : DataBase.getInstance().getUsers()) {

			if (this.user.getEmail().equals(user.getEmail())) {
				request.setValid(false);
				request.setError(String.format("%s Email address is already exist before", request.getControlName(),
						this.user.getEmail()));
				break;
			}
		}
	}
}
