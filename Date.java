package com.company;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.*;
public class Date {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(1998,8,29);
        LocalDate today= LocalDate.now();

        Period p = Period .between(date, today);
        System.out.printf("age is : %d years %d months %d days ", p.getYears(),p.getMonths(), p.getDays());

    }
}
