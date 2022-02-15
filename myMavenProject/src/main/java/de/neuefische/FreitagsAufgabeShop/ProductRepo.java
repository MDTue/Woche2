package de.neuefische.FreitagsAufgabeShop;

import java.util.HashMap;

public class ProductRepo<anzahlSaetze> {
    private HashMap<String, Product> products;

    public ProductRepo() {                                              // Konstruktor
        Product hemd = new Product("01", "Hemd1");
        Product bluse = new Product("02", "Bluse");

        HashMap<String, Product> produkte = new HashMap<>();
        produkte.put(hemd.getArtNr(), hemd);
        produkte.put(bluse.getArtNr(), bluse);
        products = produkte;
    }

    public void consolenausgabe(String artnr) {
        String artikel="";
        sucheArtikelInHashmap(artnr);
        System.out.println(products.get(artnr));
    }


    public void ausgabe() {
        int i = 1;
        int anzahlSaetze;
        String listeVonAllenProdukten = "";

        anzahlSaetze = products.size();
        while (i < anzahlSaetze) {
            listeVonAllenProdukten = products.toString();
            i = i+1;  //  i+= ;
        }
    }

    public boolean sucheArtikelInHashmap(String artnr){
        boolean gefunden = products.containsKey(artnr);
        return gefunden;
    }

    public boolean schreibeArtikelInHashmap(String artnr, String name){
        boolean nichtGefunden = products.containsKey(artnr);
        if (nichtGefunden) {
           Product neu = new Product(artnr, name);
           products.put(artnr, neu);    //toString(name)); //     .put(artnr, name);
           return true;}
        else{
            return false;
        }
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }


    }
