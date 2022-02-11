package de.neuefische.animals;

public class Animal {
    String name;
    String art;

    public Animal(String name, String art) {
        this.name = name;
        this.art = art;

        }

    @Override
    public String toString() {
        return "{Name: " + name + ", Art: " + art + "}";
    }






    public String getName() {
        return name;
    }

    public String getArt() {
        return art;
    }
}

