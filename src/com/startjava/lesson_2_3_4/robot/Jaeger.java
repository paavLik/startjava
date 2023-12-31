package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private int strength;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, int strength) {
        setModelName(modelName);
        setMark(mark);
        setStrength(strength);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName.equals("Striker Eureka") || modelName.equals("Crimson Typhoon")) {
            this.modelName = modelName;
        } else {
            System.out.println("Недопустимое имя Егеря. Допуск только для: Striker Eureka и Crimson Typhoon");
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark.equals("Mark-4") || mark.equals("Mark-5")) {
            this.mark = mark;
        } else {
            System.out.println("Требование к поколению : Mark-4 или Mark-5");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength >= 8) {
            this.strength = strength;
        } else {
            System.out.println("Егерь слишком слаб");
        }
    }

    void scanKaiju() {
        System.out.println("scumbag found");
    }

    void generateEnergy() {
        System.out.println("Активирована генерация энергии для удара");
    }

    void attack() {
        System.out.println("Атака произведена");
    }

    public void checkStatusKaiju() {
        if (modelName.equals("Crimson Typhoon")) {
            System.out.println("Ликвидирован!");
        } else {
            System.out.println("В отключке!");
        }
    }

    void react() {
        if (mark.equals("Mark-4")) {
            System.out.println("Человечество спасено!");
        } else {
            System.out.println("Делаем ноги, пока он не очнулся!");
        }
    }
}