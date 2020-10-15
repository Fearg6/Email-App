package com.mcmorrow.email.app;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;


//Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Department Codes:\n Email created: First name: "+this.firstName+" Last Name: "+this.lastName);

        this.department = setDepartment();
    }
    //Ask for the department

    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department Code");
        Scanner in = new Scanner(System.in);
        int departmentChoice =in.nextInt();
        if (departmentChoice == 1){ return "sales";}
        else if(departmentChoice == 2){return "dev";}
        else if(departmentChoice == 3){return "acct";}
        else{return "";}

    }

    // Set mailbox capacity

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    // Set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password

    public void setPassword(String password) {
        this.password = password;
    }
}
