package com.company;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Window> windows = new ArrayList<Window>();
    private List<Door> doors = new ArrayList<Door>();
    private String name;
    private String state;

    public House(String n, String s) {
        this.name = n;
        this.state = s;
    }

    public void show(){ //Вывод числа дверей и окон
        System.out.println("This house is: " + this.name );
        System.out.println("When you look on this, you see, what all doors is: " + this.state);
        System.out.println("There:" +this.windows.size()+ " Windows");
        System.out.println("There:" +this.doors.size()+ " Doors");
        System.out.println();
    }

    public void add_window(String s){
        Window w = new Window(s);
        windows.add(w);
    }

    public void add_door(String s, String t){
        Door d = new Door(s, t);
        doors.add(d);
    }
    public void open(){
        System.out.println("Outside doors opened");
        System.out.println();
        for (Door door : doors) {
            if (door.getTitle().equals("Outside")) {
                door.open();
            }
        }
        this.state = "open";
    }
    public void close(){
        System.out.println("Outside doors closed");
        System.out.println();
        for (Door door : doors) {
            if (door.getTitle().equals("Outside")) {
                door.close();
            }
        }
        this.state = "closed";
    }

    public void lock(){
        System.out.println("Outside doors now locked");
        System.out.println();
        for (Door door : doors) {
            if (door.getTitle().equals("Outside")) {
                door.lock();
            }
        }
        this.state = "locked";
    }

}