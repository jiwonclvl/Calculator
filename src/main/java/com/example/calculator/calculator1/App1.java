package com.example.calculator.calculator1;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int input1, input2;
            char operator;

            System.out.print("양의 정수 입력:");
            input1 = sc.nextInt();

            System.out.print("양의 정수 입력:");
            input2 = sc.nextInt();

            if (input1 < 0 || input2 < 0) {
                System.out.println("\n양의 정수를 입력해주세요.\n");
            }

            System.out.print("사칙연산 기호 입력:");
            operator = sc.next().charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("\n올바르지 않은 연산자 입니다.\n");
            }
            if (input2 == 0 && operator == '/') {
                System.out.println("분모에 0이 들어갈 수 없습니다.");
            }

            switch (operator) {
                case '+':
                    System.out.println("연산 결과:" + (input1 + input2));
                    break;
                case '-':
                    System.out.println("연산 결과:" + (input1 - input2));
                    break;
                case '*':
                    System.out.println("연산 결과:" + (input1 * input2));
                    break;
                case '/':
                    if (input2 != 0) {
                        System.out.println("연산 결과:" + (input1 / input2));
                        break;
                    }
                default:
                    // throws new 적용
                    break;
            }

            System.out.print("더 계산하시겠습니까? (exit 입력시 연산 종료):");
            sc.nextLine();
        } while (!"exit".equals(sc.next()));
    }
}
