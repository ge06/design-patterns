package com.company.companies;

import com.company.visitor.Visitor;

public class CoffeeShop implements Company {

    private final String companyName = "Coffee Shop Company";

    @Override
    public void insure(Visitor visitor) {
        visitor.insureDisasters(this);
    }

    @Override
    public void getInsurancePayment(Visitor visitor) {
        visitor.payDisasterInsurance(this);
    }

    @Override
    public String toString() {
        return this.companyName;
    }
}
