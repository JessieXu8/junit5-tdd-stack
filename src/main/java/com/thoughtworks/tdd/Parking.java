package com.thoughtworks.tdd;

public class Parking {
    private int number;

    public boolean isEmpty(){
        boolean flag = true;
        if (number != 0){
            flag = false;
            System.out.print("You can park your car.\n");
        }else {
            System.out.print("You cannot park your car because the Parking Lot is full.\n");
        }
        return flag;
    }

    public Parking(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
