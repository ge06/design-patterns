package com.company.companies;

import com.company.visitor.Visitor;

public interface Company {
    void insure(Visitor visitor);
    void getInsurancePayment(Visitor visitor);
}
