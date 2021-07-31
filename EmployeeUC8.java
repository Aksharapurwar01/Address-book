package com.company;
import java.lang.Math;

public class EmployeeUC8{

    public static final  int PartTime=1;
    public static final  int FullTime=2;


    public static int ComputeEmployeeWage(String company ,int empsalaryPerHour, int numofworkingDays, int maxWorkingHoursPerMonth) {

        int empHours=0,totalEmpHours=0,totalWorkingDays=0,totalEmpWage=0;

        while(totalWorkingDays < numofworkingDays && totalEmpHours < maxWorkingHoursPerMonth) {

            totalWorkingDays ++;

            int empCheck = (int)Math.floor(Math.random() *10 )% 3;


            switch(empCheck) {

                case PartTime:
                    System.out.println("Employee is Present Part Time");
                    empHours=4;
                    break;

                case FullTime:
                    System.out.println("Employee is Present Full Time");
                    empHours=8;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHours=0;

            }



            totalEmpHours += empHours;
            System.out.println("DAY:"+ totalWorkingDays +" Workinghrs:" + totalEmpHours);

        }


        totalEmpWage= totalEmpHours * empsalaryPerHour;

        System.out.println("Total wage for company " + company + " is" + totalEmpWage);
        return totalEmpWage;


    }



    public static void main(String[] args) {


        ComputeEmployeeWage("Magic",8,5,20);
        ComputeEmployeeWage("HSBC",10,6,40);


    }


}


