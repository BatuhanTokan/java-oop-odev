package com.company;

public class Pair <T,U> {
private T T1;
private U T2;
    //Yapıcı metodu deneme amaçlı kullandım bu yapıyı kurunca nesneyi tanımlarken parantez içinde bu şekilde,
    // (değişken,değişken) şeklinde veri girişi yapılması gerektiği için yorum satırına aldım.
  /* Pair(T T1,U T2){
        this.T1=T1;
        this.T2=T2;
    }*/
    public void setT1(T t1) {
        this.T1 = t1;
    }
    public void setT2(U t2) {
        this.T2 = t2;
    }

    public T getT1() {
        return this.T1;
    }

    public U getT2() {
        return this.T2;
    }
}
