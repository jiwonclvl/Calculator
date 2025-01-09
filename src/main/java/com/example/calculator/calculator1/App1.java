package com.example.calculator.calculator1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int firstNum, secondNum;
            String operators = "+ - * /";
            String inputOperator;

            // 정수 입력 부분
            try {
                System.out.print("1번째 양의 정수 입력:");
                firstNum = sc.nextInt();

                System.out.print("2번째 양의 정수 입력:");
                secondNum = sc.nextInt();

                if (firstNum < 0 || secondNum < 0) {
                    System.out.println("\n양의 정수를 입력해주세요.\n");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n정수만 입력해주세요.\n");
                continue;
            }

            //연산자 입력 부분
            System.out.print("사칙연산 기호 입력 [+ - * /]:");
            inputOperator = sc.next();

            if (!operators.contains(inputOperator)) {
                while (true) {
                    if (!operators.contains(inputOperator)) {
                        System.out.println("\n올바르지 않은 연산자 입니다.\n");
                        System.out.print("연산자 재입력:");
                        inputOperator = sc.next();
                    } else {
                        break;
                    }
                }
            }
            if (secondNum == 0 && "/".equals(inputOperator)) {
                System.out.println("분모에 0이 들어갈 수 없습니다.");
                continue;
            }

            //연산 및 연산 결과 출력
            switch (inputOperator) {
                case "+":
                    printResult (firstNum + secondNum);
                    break;
                case "-":
                    printResult (firstNum - secondNum);
                    break;
                case "*":
                    printResult (firstNum * secondNum);
                    break;
                case "/":
                    printResult ((double) firstNum / secondNum);
                    break;
                default:
                    break;
            }

            System.out.print("더 계산하시겠습니까? [exit 입력시 종료]");
            sc.nextLine();

        } while (!"exit".equals(sc.nextLine()));
    }

    public static void printResult(double result) {
        System.out.println("연산 결과 =" + result);
    }
}
