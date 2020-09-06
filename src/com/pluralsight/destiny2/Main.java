package com.pluralsight.destiny2;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        float x = 10;
        int y = -1090123;

        int z = 90123123;

        String s = String.format("This is great,isn't it %.2f",x);

        String s2 = String.format("This is great,isn't it % (,d",y);

        String s3 = String.format("This is great,isn't it %1$ (,d  %<#x",z,y);

        System.out.println(s);

        System.out.println(s2);

        System.out.println(s3);

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter ff = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(today.format(ff));

        String sw = "09-25-2020";

        LocalDate fd = LocalDate.parse(sw,ff);

        double val = -1;

        String word = "1000";

        val = Double.parseDouble(word);

        System.out.println(val);

        String d2 = "Tejas";

        String fg = "Hey there!" + d2;

        System.out.println(fg);

        String qw = "Hey there";

        String df = "Tejas";
        df += qw;

        String qw2 = "Hey there";

        String df2 = "Tejas";
        df2 += qw;

        if(df == df2)System.out.println("Done1");

        if(df.equals(df2))System.out.println("Done2");

        String df3 = df.intern();
        String df4 = df2.intern();

        if(df3 == df4)System.out.println("Done3");

        String df5 = String.valueOf(x);

        System.out.println(df5);

    }
}
