package com.example.calculator.calculator3;

public enum OperatorType {
    PLUS('+') {
        @Override
        public double apply(int input1, int input2) {
            return input1 + input2;
        }
    },
    MINUS('-') {
        @Override
        public double apply(int input1, int input2) {
            return input1 - input2;
        }
    },
    MULTI('*') {
        @Override
        public double apply(int input1, int input2) {
            return input1 * input2;
        }
    },
    DIVIDE('/') {
        @Override
        public double apply(int input1, int input2) {
            return  (double) input1 / input2;
        }
    };

    //필드
    private char symbol;

    // 생성자
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    //추상 메서드 생성
    public abstract double apply(int input1, int input2);


}
