package com.in30mins.eazyBytes;

public class InstanceMethodRef {
    public static void main(String[] args) {
        ArthmeticOperation operation = (a,b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2,3);

        InstanceMethodRef instanceMethodReference = new InstanceMethodRef();
        ArthmeticOperation methodReference = instanceMethodReference::performAddition;
        methodReference.performOperation(2,3);

        ArthmeticOperation methodReferenceSub = instanceMethodReference::performSubtraction;
        methodReferenceSub.performOperation(2,3);

    }

    public int performAddition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public int performSubtraction(int a, int b){
        int diff = a - b;
        System.out.println(diff);
        return diff;
    }
}
