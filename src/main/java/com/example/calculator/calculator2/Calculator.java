package com.example.calculator.calculator2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> resultList = new ArrayList<>();
    private double result;


    public void calculate (int firstNum, int secondNum, String operator) {
        switch (operator) {
            case "+":
                result =  firstNum + secondNum;
                break;
            case "-":
                result =  firstNum - secondNum;
                break;
            case "*":
                result =  firstNum * secondNum;
                break;
            case "/":
                result = (double) firstNum / secondNum;
                break;
            default:
                //throws new 구현
                break;
        }
        resultList.add(result);
    }

    public List<Double> getResultList() {
        return resultList;
    }

    public double printResult () {
        return this.result;
    }

    public void setResultList(List<Double> Deletelist) {
        removeResult(Deletelist);
    }

    public void removeResult(List<Double> list) {
        System.out.print("첫번째 연산 값 " + list.get(0) + "을 삭제하였습니다.\n");
        list.remove(0);

        System.out.print("연산 결과 리스트:" + list);
    }
}
