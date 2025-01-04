package com.example.calculator.calculator2;
import java.util.ArrayList;
import java.util.List;

public class calculator {
    private List<Double> answerlist = new ArrayList<Double>();

    public void calculate (int input1, int input2,char operator) {
        switch (operator) {
            case '+':
                System.out.println(input1 + " " + operator + " " + input2 + " = " + (input1 + input2));
                answerlist.add((double) input1 + input2);
                break;
            case '-':
                System.out.println(input1 + " " + operator + " " + input2 + " = " + (input1 - input2));
                answerlist.add((double) input1 - input2);
                break;
            case '*':
                System.out.println(input1 + " " + operator + " " + input2 + " = " + (input1 * input2));
                answerlist.add((double) input1 * input2);
                break;
            case '/':
                if (input2 != 0) {
                    System.out.println(input1 + " " + operator + " " + input2 + " = " + ((double) input1 / input2));
                    answerlist.add((double) input1 / input2);
                    break;
                }
            default:
                //throws new 구현
                break;
        }
        System.out.println(input1 + " " + operator + " " + input2 + " = " + ((double) input1 / input2));
    }

    public List<Double> getAnswerlist() {
        return answerlist;
    }

    public void setAnswerlist(List<Double> Deletelist) {
        removeResult(Deletelist);
    }

    public void removeResult(List<Double> list) {
        System.out.print("첫번째 연산 값 " + list.get(0) + "을 삭제하였습니다." + "\n연산 결과 리스트: [" );
        list.remove(0);

        for (Double i: list) {
            System.out.print(" " + i + " ");
        }
        System.out.print("]");
    }
}
