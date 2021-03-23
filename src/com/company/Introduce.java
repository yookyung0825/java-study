package com.company;

import java.util.Scanner;

public class Introduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름이 뭔가요?");
        String name = scanner.nextLine();

        System.out.println("나이가 몇인가요?");
        String age = scanner.nextLine();

        System.out.println("성별이 무엇인가요?");
        String gender = scanner.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}