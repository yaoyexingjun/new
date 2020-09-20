package com.resources.wu.util;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Demo class
 * Jdk1.8的stream流的常用方法
 * @author
 * @date 2020/9/18
 */
public class MyStream {

    public static void main(String[] args) {
        //======================foreach=========================
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        //=====================map================================

        List<Integer> list = Arrays.asList(3,3,2,3,7,3,5);
        List<Integer> list1 = list.stream().map(i -> i*i)
                .distinct().collect(Collectors.toList());
        list1.stream().forEach(System.out::println);
        System.out.println(list1);
        //=====================filter================================
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        //=====================sorted================================
        Random random1 = new Random();
        random1.ints().limit(10).sorted().forEach(System.out::println);
        //=====================collect================================
        System.out.println("=============");
        List<String> string2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = string2.stream().filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);
        //=====================Collectors================================
        //Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。
        // Collectors 可用于返回列表或字符串
        System.out.println("=============");
        List<String>string3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        String mergedString = string3.stream().filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        //====================统计================================
        System.out.println("=============");
//        另外，一些产生统计结果的收集器也非常有用。
//        它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

        System.out.println("==================");
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
     String s=   "aaaa";
        Boolean b = s.startsWith("a");
        System.out.println(b);
        System.out.println("====================");
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, c) -> c.compareTo(a))
                .forEach(System.out::println);

        System.out.println("=============");
 //====================reduce规约为一个数================================
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

    }
}
