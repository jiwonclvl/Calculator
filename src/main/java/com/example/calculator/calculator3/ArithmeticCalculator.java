package com.example.calculator.calculator3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Double> answerlist = new ArrayList<>();
    private double answer;

    OperatorType plus = OperatorType.PLUS;
    OperatorType minus = OperatorType.MINUS;
    OperatorType multi = OperatorType.MULTI;
    OperatorType divide = OperatorType.DIVIDE;


    public void calculate(int firstInteger, int secondInteger, char operator) {
        switch (operator) {
            case '+':
                answer = plus.apply(firstInteger, secondInteger);
                System.out.println(firstInteger + " " + operator + " " + secondInteger + " = " + answer);
                answerlist.add(answer);
                break;
            case '-':
                answer = minus.apply(firstInteger, secondInteger);
                System.out.println(firstInteger + " " + operator + " " + secondInteger + " = " + answer);
                answerlist.add(answer);
                break;
            case '*':
                answer = multi.apply(firstInteger, secondInteger);
                System.out.println(firstInteger + " " + operator + " " + secondInteger + " = " + answer);
                answerlist.add(answer);
                break;
            case '/':
                answer = divide.apply(firstInteger, secondInteger);
                System.out.println(firstInteger + " " + operator + " " + secondInteger + " = " + answer);
                answerlist.add(answer);
                break;
            default:
                //throws new 구현
                break;
        }
    }

    public List<Double> getAnswerlist() {
        return answerlist;
    }

    public void setAnswerlist(List<Double> Deletelist) {
        removeResult(Deletelist);
    }

    public void removeResult(List<Double> list) {
        System.out.print("첫번째 연산 값 " + list.get(0) + "을 삭제하였습니다.\n");
        list.remove(0);

        System.out.print("연산 결과 리스트:" + list);
    }


}


