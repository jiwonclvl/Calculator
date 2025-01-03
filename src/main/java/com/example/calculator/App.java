package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {

        int input1, input2;
        char operator;
        String end;
        Scanner sc = new Scanner(System.in);
        calculator calculate = new calculator();
        ArrayList<Integer> answer_list = new ArrayList<Integer>();

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

            System.out.print("사칙연산 기호 입력:");
            operator = sc.next().charAt(0);

            int result = calculate.calculate(input1, input2, operator);
//            System.out.println(input1 + " " +operator + " " +input2+ " = " + result);
            System.out.print("더 계산하시겠습니까? (exit 입력시 연산 종료):");


            end = sc.next();
            System.out.println();
        } while (!end.equals("exit")) ;

//        public void setAnswer_list(ArrayList<Integer> answer_list){
//
//        }

    }
}

