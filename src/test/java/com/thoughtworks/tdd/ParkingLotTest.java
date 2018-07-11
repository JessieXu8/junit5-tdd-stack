package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParkingLotTest {
    @Test
    public void should_return_false_when_call_park_when_parking_number_is_0(){
        //given
        Parking parkingLot = new Parking(0);
        Person person = new Person(1,false);
        //when
        boolean result = person.park(parkingLot);
        //then
        assertThat(result,is(false));
    }

    @Test
    public void should_return_true_when_call_park_when_parking_number_is_10(){
        //given
        Parking parkingLot = new Parking(10);
        Person person = new Person(1,false);
        //when
        boolean result = person.park(parkingLot);
        //then
        assertThat(result,is(true));
    }
    @Test
    public void should_return_false_when_call_park_when_parking_is_full(){
        //given
        Parking parkingLot = new Parking(2);
        Person person1 = new Person(1,false);
        person1.park(parkingLot);
        Person person2 = new Person(2,false);
        person2.park(parkingLot);
        Person person3 = new Person(3,false);
        //when
        boolean result = person3.park(parkingLot);
        //then
        assertThat(result,is(false));
    }
    @Test
    public void should_return_carId_when_call_takeOutCar_when_car_is_already_in_Parking_Lot(){
        //given
        Parking parkingLot = new Parking(2);
        Person person1 = new Person(1,false);
        person1.park(parkingLot);
        Person person2 = new Person(2,false);
        person2.park(parkingLot);
        //when
        String result = person2.takeOutCar();
        //then
        assertThat(result,is("You have take out your car. And your carID is 2."));
    }
    @Test
    public void should_return_Hint_information_when_call_takeOutCar_when_car_is_not_in_Parking_Lot(){
        //given
        Parking parkingLot = new Parking(2);
        Person person1 = new Person(1,false);
        person1.park(parkingLot);
        Person person2 = new Person(2,false);
        person2.park(parkingLot);
        Person person3 = new Person(3,false);
        //when
        String result = person3.takeOutCar();
        //then
        assertThat(result,is("You have not park your car in the Parking Lot."));
    }
}
