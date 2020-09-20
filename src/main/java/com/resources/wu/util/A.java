package com.resources.wu.util;

import com.resources.wu.entity.Person;

import java.util.function.Consumer;

/**
 * Demo class
 *
 * @author
 * @date 2020/9/20
 */
public class A {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }


    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> {
             return Integer.valueOf(from); };
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123



        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);


        System.out.println(stringConverter.convert(2));

    }
}
