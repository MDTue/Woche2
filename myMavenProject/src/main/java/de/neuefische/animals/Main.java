package de.neuefische.animals;

public class Main {
    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        list.add(new Animal("Giraffe", "Säugetier"));
        list.add(new Animal("Bär", "Säugetier"));
        list.add(new Animal("Delphin", "Säugetier"));
        list.add(new Animal("Wal", "Fisch"));
    }


}