package com.company;
import java.util.Scanner;

class UC1
{

    String FirstName;
    String LastName;
    String Adress;
    String City;
    String State;
    int Phonenumber;
    int zip;


    void GetData()           // Defining GetData()
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter First Name : ");
        FirstName = sc.nextLine();

        System.out.print("\n\tEnter Last Name : ");
        LastName = sc.nextLine();

        System.out.print("\n\tEnter Address : ");
        Adress = sc.nextLine();

        System.out.print("\n\tEnter City : ");
        City  = sc.nextLine();

        System.out.print("\n\tEnter State : ");
        State  = sc.nextLine();

        System.out.print("\n\tEnter Zip : ");
        zip = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Phone Number : ");
        Phonenumber = Integer.parseInt(sc.nextLine());

    }

    void PutData()           // Defining PutData()
    {

        System.out.print("\n\tEmployee Id : "+FirstName);
        System.out.print("\n\tEmployee Name : "+LastName);
        System.out.print("\n\tEmployee Age : "+Adress);
        System.out.print("\n\tEmployee City : "+City);
        System.out.print("\n\tEmployee State : "+State);
        System.out.print("\n\tEmployee zip : "+zip);
        System.out.print("\n\tEmployee phonenumber : "+Phonenumber);

    }

    public static void main(String args[])
    {

        UC1 E = new UC1();// Creating Object

        E.GetData();          // Calling GetData()
        E.PutData();          // Calling PutData()

    }
}