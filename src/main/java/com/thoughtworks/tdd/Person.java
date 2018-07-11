package com.thoughtworks.tdd;

public class Person {
    private int carID;

    private boolean isParking;

    public Person(int carID, boolean isParking) {
        this.carID = carID;
        this.isParking = isParking;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public boolean isParking() {
        return isParking;
    }

    public void setParking(boolean parking) {
        isParking = parking;
    }


    public boolean park(Parking park){
        isParking = false;
        if(!(park.isEmpty())){
            int num = park.getNumber();
            num--;
            park.setNumber(num);
            isParking = true;
            System.out.print("You successfully put your car in the Parking Lot.And your carID is "+carID+".\n");
        }
        return isParking;
    }
    public String takeOutCar(){
        String str="";
        if (isParking){
            isParking = false;
            str = "You have take out your car. And your carID is "+carID+".";
            System.out.print(str+"\n");
            return str;
        }else {
            str = "You have not park your car in the Parking Lot.";
            System.out.print(str+"\n");
            return str;
        }
    }
}
