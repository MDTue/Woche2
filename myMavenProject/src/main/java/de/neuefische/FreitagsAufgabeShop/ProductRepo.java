package de.neuefische.FreitagsAufgabeShop;

import java.util.HashMap;

public class ProductRepo {
    private HashMap<String, Product> products;

    public ProductRepo() {                                              // Konstruktor
        Product hemd = new Product("01", "Hemd1");
        Product bluse = new Product("02", "Bluse");

        HashMap<String, Product>  produkte = new HashMap<>();
        produkte.put(hemd.getArtNr(), hemd);
        produkte.put(bluse.getArtNr(), bluse);
        products = produkte;
    }

    public void consolenausgabe() {
        System.out.println(products.size());
        System.out.println(products.get("01"));
    }


    public HashMap<String, Product> getProducts() {


        return products;
    }
}
