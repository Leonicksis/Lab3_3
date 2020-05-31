package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House("Abandoned", "close");
        h.add_window("Closed");
        h.add_window("Blocked");
        h.add_window("Barricaded");
        h.add_door("Closed", "Butchery");
        h.add_door("Closed", "Outside");
        h.add_door("Closed", "Crypt");
        h.show();
        h.lock();
        h.show();
        h.open();
        h.show();
    }
}