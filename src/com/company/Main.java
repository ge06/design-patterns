package com.company;

import com.company.companies.Bank;
import com.company.companies.CoffeeShop;
import com.company.companies.Company;
import com.company.visitor.InsuranceVisitor;
import com.company.companies.ResidentalBuilding;
import com.company.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Company> companyList = new ArrayList<>(Arrays.asList(new ResidentalBuilding(), new Bank(), new CoffeeShop()));
            Visitor visitor = new InsuranceVisitor();
            System.out.println("Welcome to insurance system. Please select one of the operations listed below: ");
            System.out.println("Type 1 to get insurance help ");
            System.out.println("Type 2 to insure your company ");
            int operation = scanner.nextInt();
            System.out.println("Please select one of the companies listed below: ");
            System.out.println("Type 1 for Residental Building ");
            System.out.println("Type 2 for Bank ");
            System.out.println("Type 3 for Coffee Shop ");
            int company = scanner.nextInt();
            if (operation == 1) {
                companyList.get(company - 1).getInsurancePayment(visitor);
            } else if (operation == 2) {
                companyList.get(company - 1).insure(visitor);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please type a valid option.");
        }
    }
}
