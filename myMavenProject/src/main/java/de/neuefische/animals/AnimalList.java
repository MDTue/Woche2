package de.neuefische.animals;

public class AnimalList {
    AnimalListItem head;

    public void add(Animal value) {
        if (head == null) {
            head = new AnimalListItem(value);
        } else {
            AnimalListItem current = head;
            while (current.next != null) {
                current = current.next;
                current.next = new AnimalListItem(value);
                System.out.println(current.next);
            }
        }
    }

    public String toString(AnimalList name, AnimalList art){

        System.out.println(name);
        return "Name: "+name+", Art: " + art;
    }


    public AnimalListItem getHead() {
        return head;
    }
}
