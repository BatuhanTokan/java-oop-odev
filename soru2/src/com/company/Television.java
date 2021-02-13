package com.company;

public class Television {
    private int width, height, screenSize, maxVolume = 100, volume;
    private boolean power;

    public Television() {
        this.width = 0;
        this.height = 0;
        this.screenSize = 0;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    protected void SesArttir(int Ses) {

        if (Ses <= maxVolume) {
            volume += Ses;
            System.out.println(volume);

        }
        else{System.out.println("Ses Maksimum düzeyde daha fazla yükselemez");}

    }

    public void SesAzalt(int Ses1) {

        if (volume > 0) {
            volume = volume - Ses1;
            System.out.println(volume);
        } else {
            System.out.println("Ses Arttırılamadı:" + volume);
        }

    }
    public void OnOff(String baslat)
    {
        power=(baslat=="Start");
        System.out.println(power);

    }


    }

