package com.in30mins;

public class MyDataFormatter {
    public String removeSplChar(String s){
        return  s.replaceAll("[^a-zA-Z0-9]","");
    }
}
