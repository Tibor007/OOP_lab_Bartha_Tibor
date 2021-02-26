package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle  teglalap = new Rectangle();
        Rectangle  teglalap1 = new Rectangle(15,20);
        Rectangle  teglalap2 = new Rectangle(12);

        System.out.println(teglalap);
        System.out.println(teglalap1);
        System.out.println(teglalap2);

        System.out.println(teglalap.getWidth());
        teglalap.setWidth(100);
        System.out.println(teglalap);

    }
}
