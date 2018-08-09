package com.mum.asd.OnlineBankingFramework.validation;

import com.mum.asd.OnlineBankingFramework.validation.models.Request;

public interface Validator {
    public void setNextValidator(Validator validator);
    public void validate(Request request);
}
