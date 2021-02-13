package com.company;

public class AdvancedCalculator extends BasicCalculator implements Scientific{

    public void kare(int s) {
        int karehesap=s*s;
        System.out.println("Girilen sayının karesi:"+karehesap);
    }


    public void kup(int s) {
        int kuphesap=s*s*s;
        System.out.println("Girilen sayının küpü:"+kuphesap);
    }
}
