package com.in30mins.eazyBytes;

public class StaticMethodRef {
    public static void main(String[] args) {
        ArthmeticOperation operation = (a,b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2,3);

        ArthmeticOperation methodReference = StaticMethodRef::performAddition;
        methodReference.performOperation(2,3);

    }

    public static int performAddition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
