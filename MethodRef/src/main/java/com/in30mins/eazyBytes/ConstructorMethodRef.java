package com.in30mins.eazyBytes;

public class ConstructorMethodRef {
    public static void main(String[] args) {
        ProductInterface productInterface = (name, price) -> new Product(name, price);
        System.out.println(productInterface.getProduct("Apple Mac", 2000));

        ProductInterface constructorReference = Product::new;
        System.out.println(constructorReference.getProduct("Apple Iphone", 1000));
    }
}
