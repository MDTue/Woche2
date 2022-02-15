package de.neuefische.alarm;

public enum Alarmlevel {
    RED(0),
    YELLOW(30),
    GREEN(60);

    private int anzPersonen;
    Alarmlevel(int anzPersonen){
        this.anzPersonen = anzPersonen;
    }

    public int getAnzPersonen(){
        return anzPersonen;
}

    public String checkCustomers(int numberOfCustomers, int maxNumberOfCustomers) {
        if (numberOfCustomers > maxNumberOfCustomers) {
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";
    }

}


