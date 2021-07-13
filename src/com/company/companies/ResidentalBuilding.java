package com.company.companies;

import com.company.companies.Company;
import com.company.visitor.Visitor;

public class ResidentalBuilding implements Company {

    private final String companyName = "Residental Building Company";

    @Override
    public void insure(Visitor visitor) {
        visitor.insureMedical(this);
    }

    @Override
    public void getInsurancePayment(Visitor visitor) {
        visitor.payMedicalInsurance(this);
    }

    @Override
    public String toString() {
        return this.companyName;
    }
}
