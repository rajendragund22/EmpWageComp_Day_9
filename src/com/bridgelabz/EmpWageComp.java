package com.bridgelabz;


public class EmpWageComp {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        EmpWageComp kMart = new EmpWageComp("K'mart", 20, 20, 100);
        EmpWageComp bridgelabz = new EmpWageComp("Bridgelabz", 10, 20, 110);
        EmpWageComp JIO = new EmpWageComp("JIO", 15, 20, 80);
        kMart.computeEmpWage();
        System.out.println(kMart);
        bridgelabz.computeEmpWage();
        System.out.println(bridgelabz);
        JIO.computeEmpWage();
        System.out.println(JIO);
    }

    public EmpWageComp(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day-:" + totalWorkingDays + " Employee Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
    }

    public String toString() {
        return ("Total employee  Wage for the " + company + " is: " + totalEmpWage);
    }
}

