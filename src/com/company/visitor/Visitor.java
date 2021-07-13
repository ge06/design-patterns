package com.company.visitor;

import com.company.companies.Company;

public interface Visitor {
    void insureMedical(Company company);

    void insureTheft(Company company);

    void insureDisasters(Company company);

    void payMedicalInsurance(Company company);

    void payDisasterInsurance(Company company);

    void payTheftInsurance(Company company);
}
