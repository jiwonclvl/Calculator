package com.example.calculator.calculator3;

public enum OperatorType {
    PLUS('+') {
        @Override
        public double apply(int firstInteger, int secondInteger) {
            return firstInteger + secondInteger;
        }
    },
    MINUS('-') {
        @Override
        public double apply(int firstInteger, int secondInteger) {
            return firstInteger - secondInteger;
        }
    },
    MULTI('*') {
        @Override
        public double apply(int firstInteger, int secondInteger) {
            return firstInteger * secondInteger;
        }
    },
    DIVIDE('/') {
        @Override
        public double apply(int firstInteger, int secondInteger) {
            return  (double) firstInteger / secondInteger;
        }
    };

    //필드
    private char symbol;

    // 생성자
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    //추상 메서드 생성
    public abstract double apply(int firstInteger, int secondInteger);
}
