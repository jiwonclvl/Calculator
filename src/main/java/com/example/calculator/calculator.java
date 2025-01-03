package com.example.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int input1, input2, answer = 0;
        char operator;
        String end;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("양의 정수 입력:");
            input1 = sc.nextInt();

            System.out.print("양의 정수 입력:");
            input2 = sc.nextInt();

            System.out.print("사칙연산 기호 입력:");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    answer = input1 + input2;
                    System.out.println(input1 + " " +operator + " " +input2+ " = " + answer);
                    break;
                case '-':
                    answer = input1 - input2;
                    System.out.println(input1 + " " +operator + " " +input2+ " = " + answer);
                    break;
                case '*':
                    answer = input1 * input2;
                    System.out.println(input1 + " " +operator + " " +input2+ " = " + answer);
                    break;
                case '/':
                    if (input2 != 0) {
                        answer = input1 / input2;
                        System.out.println(input1 + " " +operator + " " +input2+ " = " + answer);
                    } else {
                        System.out.println("분모에 0이 들어갈 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("올바르지 않은 연산자 입니다.");
                    break;
            }
            System.out.print("더 계산하시겠습니까? (exit 입력시 연산 종료):");
            end = sc.next();

            System.out.println();
        } while (!end.equals("exit")) ;

    }
}
