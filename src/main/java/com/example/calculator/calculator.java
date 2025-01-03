package com.example.calculator;

import java.util.ArrayList;

public class calculator {
    int answer;
//    private ArrayList<Integer> answer_list = new ArrayList<Integer>();

    public int calculate(int input1, int input2,char operator){
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
//        answer_list.add(answer);
        return answer;
    }

//    public ArrayList<Integer> getAnswer_list(){
//            return answer_list;
//    }

}
