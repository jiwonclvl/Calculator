package com.example.calculator.calculator2;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculate = new Calculator();

        do {
            int firstInteger, secondInteger;
            String operators = "+ - * /";
            String operator;

            System.out.print("양의 정수 입력:");
            firstInteger = sc.nextInt();

            System.out.print("양의 정수 입력:");
            secondInteger = sc.nextInt();

            if (firstInteger < 0 || secondInteger < 0) {
                System.out.println("\n양의 정수를 입력해주세요.\n");
                continue;
            }

            System.out.print("사칙연산 기호 입력:");
            operator = sc.next();

            if (!operators.contains(operator)) {
                System.out.println("\n올바르지 않은 연산자 입니다.\n");
                continue;
            }
            if (secondInteger == 0 && "/".equals(operator)) {
                System.out.println("분모에 0이 들어갈 수 없습니다.");
                continue;
            }

            calculate.calculate(firstInteger, secondInteger, operator);

            System.out.print("더 계산하시겠습니까? (exit 입력시 연산 종료)\n");
            sc.nextLine();

        } while (!"exit".equals(sc.nextLine()));

        List<Double> list = calculate.getAnswerlist();
        calculate.setAnswerlist(list);
    }
}

