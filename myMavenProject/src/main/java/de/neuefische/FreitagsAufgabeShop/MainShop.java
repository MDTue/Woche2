package de.neuefische.FreitagsAufgabeShop;

public class MainShop {
    public static void main(String[] args) {
        Product hemd = new Product("01", "Hemd1");
        Product bluse = new Product("02", "Bluse");

        ProductRepo listenAusdruck = new ProductRepo();  // Objekt der Klasse ProduktRepo, dass u.a. Listen ausdruckt
        listenAusdruck.consolenausgabe();
    }

}
