package com.in30mins;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class MethodRefDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays
                .asList("nad##%an","","al&%^&an","rose","","tom","alex%$!!@",null));

        /*
        Given a list of employees names given:
        - Exclude the empty strings
        - Remove special characters if any
        - Convert to upper case
        - sort it alphabetical order
        - Create Employee objects

         */

        MyDataFormatter mfd = new MyDataFormatter();
        names.stream()
//                .filter(e-> StringUtils.isNotEmpty(e))
                .filter(StringUtils::isNoneEmpty)   // Static Method usig Static Method

//                .map(e ->mfd.removeSplChar(e))
                .map(mfd::removeSplChar) // Method refrence using an instance method

//                .map(e -> e.toUpperCase())
                .map(String::toUpperCase)  // Method Refrence using instance method but for an arbitrary object

//                .sorted((e1,e2) ->e1.compareTo(e2))
                .sorted(String::compareTo)   // 2 parameters. 1 as target; other as arguments.

//                .map(e -> new Employee(e))
                .map(Employee::new) // Method refrence using constructor
//                .forEach(data-> System.out.println(data));
                .forEach(System.out::println);
    }
}
