package de.neuefische.FreitagsAufgabeShop;

import java.util.HashMap;


public class OrderRepo {

    private HashMap<String, Order>order;

    public OrderRepo() {                                              // Konstruktor
        Order order1 = new Order("BK001", "01", "Hemd", 2);
        Order order2 = new Order("AR001", "02", "Bluse", 10);
        HashMap<String, Order> order = new HashMap<>();
        order.put(order1.getId(), order1);
        order.put(order2.getId(), order2);
        order = order;
        System.out.println(order);
    }

/*
    public HashMap<String, Order> getOrder() {
        return order;
    }
*/
    // Generate -> Konstruktor
    public OrderRepo(HashMap<String, Order> order) {
        this.order = order;
    }
 /*
    public HashMap<String, Product> getProducts() {
        return products;
    }
*/
    // bestellungenEinzel("AR001")
    public void bestellungenEinzel(String id) {
        String artikel = "";
        System.out.println(order.get(id));

        if (sucheBestellungInHashmap(id)) {
            System.out.println(order.get(id));
        } else {
            System.out.println("Bestellung nicht gefunden!");
        }
    }

    public boolean sucheBestellungInHashmap(String id) {
        boolean gefunden = order.containsKey(id);
        return gefunden;
    }

    public void bestellungenAlle() {
        int i = 1;
        int anzahlSaetze;
        String listeVonAllenBestellungen = "";

        anzahlSaetze = order.size();
        while (i < anzahlSaetze) {
            listeVonAllenBestellungen = order.toString();
            i = i + 1;  //  i+= ;
        }
    }

}
