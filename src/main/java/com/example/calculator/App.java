package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {

        int input1, input2;
        char operator;
        String end = "";
        Scanner sc = new Scanner(System.in);
        calculator calculate = new calculator();

        do {
//            try{
//                  System.out.print("양의 정수 입력:");
//                  input1 = sc.nextInt();
//
//                  System.out.print("양의 정수 입력:");
//                  input2 = sc.nextInt();d

//            } catch (Exception){
//                System.out.print("양의 정수를 입력해주세요.");
//            }

            System.out.print("양의 정수 입력:");
            input1 = sc.nextInt();

            System.out.print("양의 정수 입력:");
            input2 = sc.nextInt();

//           양의 정수가 입력되지 않은 경우
            if(input1 < 0 || input2 <0){
                System.out.println("\n양의 정수를 입력해주세요.\n");
                continue;
            }

            System.out.print("사칙연산 기호 입력:");
            operator = sc.next().charAt(0);

            //  올바른 연산자가 아닌 경우
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/'){
                System.out.println("\n올바르지 않은 연산자 입니다.\n");
                continue;
            }

            double result = calculate.calculate(input1, input2, operator);

            System.out.print("더 계산하시겠습니까? (exit 입력시 연산 종료):");
            end = sc.next();
            System.out.println();
        } while (!end.equals("exit")) ;

        ArrayList<Double> list = calculate.getAnswer_list();
        calculate.setAnswer_list(list);
    }
}

