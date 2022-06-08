package com.company;

public class HaNoiTower {
    public void move(int numOfDiscs, char from, char inter, char to) {
        if(numOfDiscs == 1) {
            System.out.println("Moving disc 1 from "+ from + " to " + to);
            return;
        } else {
            move(numOfDiscs-1, from, to, inter);
            System.out.println("Moving disc "+ numOfDiscs + " from "+ from + " to "+ to);
            move(numOfDiscs-1, inter, from, to);
        }
    }
}
