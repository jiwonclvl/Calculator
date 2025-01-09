package com.example.calculator.calculator2;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculate = new Calculator();
        List<Double> list = calculate.getResultList();

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
                System.out.println("\n분모에 0이 들어갈 수 없습니다.\n");
                continue;
            }

            //연산 및 연산 결과 출력
            calculate.calculate(firstNum, secondNum, inputOperator);

            double result = calculate.printResult();
            System.out.println(firstNum + " " + inputOperator + " " + secondNum + " = " + result);

            System.out.print("더 계산하시겠습니까? [exit 입력시 종료]\n");
            sc.nextLine();

        } while (!"exit".equals(sc.nextLine()));

        //값 삭제 부분
        System.out.print("첫번째 값 삭제를 원한다면 Y를 눌러주세요. Y/N\n");
        if ("Y".equals(sc.nextLine())) {
            calculate.setResultList(list);
        } else {
            System.out.print("계산을 종료합니다.\n");
        }
    }
}

