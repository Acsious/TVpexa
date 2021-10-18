package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String testStr=scanner.nextLine();
        Pattern pattern=Pattern.compile("(([c-d]+){2})");
        Matcher matcher=pattern.matcher(testStr);
        boolean b=matcher.matches();
        if (b) {
            System.out.println("Строка правильная.");
        }
        else{
            System.out.println("Строка неправильная.");
        }
    }
}

