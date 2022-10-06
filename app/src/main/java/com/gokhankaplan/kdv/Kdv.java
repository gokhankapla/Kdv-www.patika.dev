package com.gokhankaplan.kdv;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double a,b,c,kdvOran, d,e ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tutarı Giriniz: ");
        a = input.nextInt();
        kdvOran = (a > 1000) ?0.08:0.18;
        d = a * kdvOran;
        c = a + d;
        System.out.println("KDV Tutarı: " + d);
        System.out.println("Toplam Tutar:" + c);





    }
}
