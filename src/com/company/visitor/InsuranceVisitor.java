package com.company.visitor;

import com.company.companies.Company;
import com.company.visitor.Visitor;

public class InsuranceVisitor implements Visitor {

    @Override
    // Residental building şirketi için sağlık sigortası yapılmalı. Buraya Company olarak geliyor fakat residental building
    // objesi olacak.
    public void insureMedical(Company company) {
        System.out.println("Medical insurance made for: ");
        System.out.println(company.toString());
    }

    @Override
    // Banka şirketi için hırsızlık sigortası yapılmalı. Buraya Company olarak geliyor fakat banka
    // objesi olacak.
    public void insureTheft(Company company) {
        System.out.println("Theft insurance made for: ");
        System.out.println(company.toString());
    }

    @Override
    // Kahve şirketi için doğal afet(yangın, sel) sigortası yapılmalı. Buraya Company olarak geliyor fakat coffee shop
    // objesi olacak.
    public void insureDisasters(Company company) {
        System.out.println("Disasters insurance made for: ");
        System.out.println(company.toString());
    }

    @Override
    public void payMedicalInsurance(Company company) {
        System.out.println("100$ medical insurance help paid for: ");
        System.out.println(company.toString());
    }

    @Override
    public void payDisasterInsurance(Company company) {
        System.out.println("150$ disasters insurance help paid for: ");
        System.out.println(company.toString());
    }

    @Override
    public void payTheftInsurance(Company company) {
        System.out.println("200$ theft insurance help paid for: ");
        System.out.println(company.toString());
    }
}
