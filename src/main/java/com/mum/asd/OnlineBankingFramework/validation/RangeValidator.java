package com.mum.asd.OnlineBankingFramework.validation;

import com.mum.asd.OnlineBankingFramework.validation.models.Request;

public class RangeValidator implements Validator {

    private Validator nextValidator;
    private long min;

    public RangeValidator(long min) {
        this.min = min;
    }

    @Override
    public void setNextValidator(Validator validator) {
        this.nextValidator=validator;
    }

    @Override
    public void validate(Request request) {
        request.setValid(true);
        if(request.getValue().length()<this.min) {
            request.setValid(false);
            request.setError(String.format("%s should have at least %d characters", request.getControlName(),this.min));
        }
        else {
            if(this.nextValidator!=null)
                this.nextValidator.validate(request);
        }
    }
}
