package com.company;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        String name = scanner.next();
        System.out.println("Hi, " + name + " When were you born? (YYYY-MM-dd)");
        String date = scanner.next();
        age(date, name);

//gdfg
    }

    public static void age(String age, String name){

        int consumersAge = Period. between(LocalDate.parse(age),LocalDate.now())
                .getYears();

        System.out.println(name + " you are " + consumersAge + " years old! Yes, very old:)");
    }


}
