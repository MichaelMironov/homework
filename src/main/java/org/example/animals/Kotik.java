package org.example.animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private final int METHODS = 5;
    private static int count;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        count++;
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public boolean play() {

        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        }else{
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean sleep() {

        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        }else{
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean wash() {

        if (satiety > 0) {
            System.out.println("Котик умывается");
            satiety--;
            return true;
        }else{
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean walk() {

        if (satiety > 0) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        }else{
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean hunt() {

        if (satiety > 0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        }else{
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public void eat(int satiety){
        this.satiety = satiety;
    }

    public void eat(int satiety2, String food){
        this.satiety += satiety2;
    }

    public void eat(){
        eat(this.satiety, "kitty-kat");
    }

    public String[] liveAnotherDay() {
        String[] schedule = new String[24];
        for (int i = 0; i < schedule.length; i++) {
            switch ((int)(Math.random() * METHODS) + 1){
                case 1:
                    if (play()) {
                        play();
                        schedule[i] = i + " - играл";
                    }
                    else {
                        eat(satiety);
                        schedule[i] = i + " - ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        sleep();
                        schedule[i] = i + " - спал";
                    }
                    else {
                        eat(satiety);
                        schedule[i] = i + " - ел";
                    }
                    break;
                case 3:
                    if (wash()) {
                        wash();
                        schedule[i] = i + " - умывался";
                    }
                    else {
                        eat(satiety);
                        schedule[i] = i + " - ел";
                    }
                    break;
                case 4:
                    if (walk()) {
                        walk();
                        schedule[i] = i + " - гулял";
                    }
                    else {
                        eat(satiety);
                        schedule[i] = i + " - ел";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        hunt();
                        schedule[i] = i + " - охотился";
                    }
                    else {
                        eat(satiety);
                        schedule[i] = i + " - ел";
                    }
                    break;
            }
        }

        return schedule;
    }
}
