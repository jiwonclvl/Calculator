package com.example.calculator.calculator2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> answerlist = new ArrayList<Double>();


    public void calculate (int firstInteger, int secondInteger, char operator) {
        switch (operator) {
            case '+':
                printResult(firstInteger, secondInteger, operator, (double) firstInteger + secondInteger);
                answerlist.add((double) firstInteger + secondInteger);
                break;
            case '-':
                printResult(firstInteger, secondInteger, operator, (double) firstInteger - secondInteger);
                answerlist.add((double) firstInteger - secondInteger);
                break;
            case '*':
                printResult(firstInteger, secondInteger, operator, (double) firstInteger * secondInteger);
                answerlist.add((double) firstInteger * secondInteger);
                break;
            case '/':
                printResult(firstInteger, secondInteger, operator, (double) firstInteger / secondInteger);
                answerlist.add((double) firstInteger / secondInteger);
                break;
            default:
                //throws new 구현
                break;
        }
    }

    public List<Double> getAnswerlist() {
        return answerlist;
    }

    public void printResult (int firstInteger, int secondInteger, char operator, double result) {
        System.out.println(firstInteger + " " + operator + " " + secondInteger + " = " + result);
    }

    public void setAnswerlist(List<Double> Deletelist) {
        removeResult(Deletelist);
    }

    public void removeResult(List<Double> list) {
        System.out.print("첫번째 연산 값 " + list.get(0) + "을 삭제하였습니다.\n");
        list.remove(0);

        System.out.print("연산 결과 리스트:" + list.toString());
    }
}
