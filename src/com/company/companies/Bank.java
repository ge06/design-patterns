package com.company.companies;

import com.company.visitor.Visitor;

public class Bank implements Company {

    private final String companyName = "Bank Company";

    @Override
    public void insure(Visitor visitor) {
        visitor.insureTheft(this);
    }

    @Override
    public void getInsurancePayment(Visitor visitor) {
        visitor.payTheftInsurance(this);
    }

    @Override
    public String toString() {
        return this.companyName;
    }
}
