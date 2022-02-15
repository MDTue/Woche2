package de.neuefische.alarm;

public class Alarm {

    public static String checkNumberOfCustomers(int numberOfCustomers, Alarmlevel alarmlevel) {
      return alarmlevel.checkCustomers(numberOfCustomers, alarmlevel.getAnzPersonen());

    }






}
