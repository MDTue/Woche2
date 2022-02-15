package de.neuefische.FreitagsAufgabeShop;

import java.util.HashMap;

public class Order {
    private String id;
    private String artNr;
    private String artName;
    private int bestellMenge;


  public Order(String id, String artNr, String artName, int bestellMenge){
         this.id = id;
        this.artNr = artNr;
     //   this.artName = artName;
     //   this.bestellMenge = bestellMenge;
    }

    public String getArtNr() {
        return artNr;
    }

    public String getId() {
        return id;
    }



}
