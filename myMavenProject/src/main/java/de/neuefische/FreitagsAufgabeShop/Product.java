package de.neuefische.FreitagsAufgabeShop;

import de.neuefische.animals.AnimalList;

public class Product {
    private String artNr;
    private String artName;

    public Product(String artNr, String artName){
        this.artNr = artNr;
        this.artName = artName;
    }

    public String getArtNr() {
        return artNr;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "Art.Nr='" + artNr + '\'' +
                ", Name='" + artName + '\'' +
                '}';
    }
}
