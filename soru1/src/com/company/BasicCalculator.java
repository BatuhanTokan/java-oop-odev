package com.company;

public class BasicCalculator implements Calculator{

    public void toplam(int s1, int s2) {
       int Sonuc=s1+s2;
       System.out.println("Toplama işleminin sonucu:"+Sonuc);
    }


    public void cikarma(int s1, int s2) {
        int Sonuc=s1-s2;
        System.out.println("Çıkarma işleminin sonucu:"+Sonuc);
    }


    public void carpma(int s1, int s2) {
        int Sonuc=s1*s2;
        System.out.println("Çarpma işleminin sonucu:"+Sonuc);
    }


    public void bolme(int s1, int s2) {
        int Sonuc=s1/s2;
        System.out.println("Bölme işleminin sonucu:"+Sonuc);
    }
}
