package de.neuefische.FreitagsAufgabeShop;

import java.util.HashMap;

public class MainShop {
    public MainShop() {
    }

    public static void main(String[] args) {
        String artnr = "01";
        Product hemd = new Product("01", "Hemd1");
        Product bluse = new Product("02", "Bluse");

        ProductRepo listenAusdruck = new ProductRepo();  // Objekt der Klasse ProduktRepo, dass u.a. Listen ausdruckt
        listenAusdruck.consolenausgabe("01");
        listenAusdruck.ausgabe();     //druckt alle Artikel

        boolean artikelVorhanden = listenAusdruck.sucheArtikelInHashmap(artnr);
        boolean neuAngelegt = listenAusdruck.schreibeArtikelInHashmap("03","Rock");


        String id = "AR001";
        Order order1 = new Order("BK001", "01", "Hemd", 2);
        Order order2 = new Order("AR001", "02", "Bluse", 10);


        OrderRepo bestellungen = new OrderRepo();
        bestellungen.bestellungenEinzel("AR001");
        bestellungen.bestellungenAlle();
    }

}
