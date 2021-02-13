package com.company;

public class Main {

    public static void main(String[] args) {

        Pair<String,Integer> jenerik1=new Pair<String,Integer>();
        Pair<Double,Character> jenerik2=new Pair<>();
        //yapıcı metodu kullanınca nesneyi bu şekilde tanımlıyoruz
        //Pair<Double,Character> jenerik3=new Pair<>(35.01,'B');
        jenerik1.setT1("Kodluyoruz");
        jenerik1.setT2(15);
        jenerik2.setT1(10.00);
        jenerik2.setT2('C');
      System.out.println(jenerik1.getT1());
      System.out.println(jenerik1.getT2());
        System.out.println(jenerik2.getT1());
        System.out.println(jenerik2.getT2());
        //System.out.println(jenerik3.getT1());
        //System.out.println(jenerik3.getT2());




    }
}
