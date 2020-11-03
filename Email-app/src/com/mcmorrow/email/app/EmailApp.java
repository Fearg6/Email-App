package com.mcmorrow.email.app;

public class EmailApp {

    public static void main(String[] args) {
	    Email email = new Email("Jane","Mane");
        email.setAlternateEmail("Jm@gmail.com");
        System.out.println("Print Alternate Email: "+email.getAlternateEmail());
    }
}
