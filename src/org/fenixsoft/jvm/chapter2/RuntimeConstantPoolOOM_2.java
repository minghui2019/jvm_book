package org.fenixsoft.jvm.chapter2;

public class RuntimeConstantPoolOOM_2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
/*
 * output(java 6)
 * false
 * false
 * 存储于永久代常量池
 * (java 7)
 * true
 * false
 * 存储于Java堆
 */