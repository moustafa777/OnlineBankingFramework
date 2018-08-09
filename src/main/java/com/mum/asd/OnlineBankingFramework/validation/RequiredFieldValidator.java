package com.mum.asd.OnlineBankingFramework.validation;

import com.mum.asd.OnlineBankingFramework.validation.models.Request;

public class RequiredFieldValidator implements Validator {

    private Validator nextValidator;

    @Override
    public void setNextValidator(Validator validator) {
        this.nextValidator=validator;
    }

    @Override
    public void validate(Request request) {
        request.setValid(true);
        if(request.getValue().isEmpty()) {
            request.setValid(false);
            request.setError(String.format("%s can not be empty", request.getControlName()));
        }
        else {
            if(this.nextValidator!=null)
                this.nextValidator.validate(request);
        }
    }
}
