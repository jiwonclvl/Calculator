package com.example.calculator;

import java.util.ArrayList;

public class calculator {

    private ArrayList<Double> answer_list = new ArrayList<>();
    double answer;

    public double calculate(int input1, int input2,char operator){
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
                    answer = (double) input1 / input2;
                    System.out.println(input1 + " " +operator + " " +input2+ " = " + answer);
                    break;
                }
            default:
                break;
        }
        answer_list.add(answer);
        return answer;
    }

    public ArrayList<Double> getAnswer_list(){
            return answer_list;
    }

    public void setAnswer_list(ArrayList<Double> Delete_list){
            removeResult(Delete_list);
    }

    public void removeResult(ArrayList<Double> list){

        System.out.print("첫번째 연산 값 " +list.get(0) + "을 삭제하였습니다." + "\n연산 결과 리스트: [" );
        list.remove(0);
        for(Double i: list){
            System.out.print(" " + i + " ");
        }
        System.out.print("]");
    }

}
