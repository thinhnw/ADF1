package com.fptaptech.lab3;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int pos;
    private List<User> users;

    public Room() {
        name = "";
        pos = -1;
        users = new ArrayList<User>();
    }

    public Room(String name, int pos) {
        this.name = name;
        this.pos = pos;
        users = new ArrayList<User>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void addUser(User u) {
        this.users.add(u);
    }

    public void removeUser(User u) {
        this.users.remove(u);
    }

    @Override
    public String toString() {
        return "Room:" +
                " name='" + name + '\'' +
                ", pos=" + pos +
                ", users=" + users.toString();
    }

    public static void main(String[] args) {

        User userOne = new User("Mike");
        User userTwo = new User("Scottie");

        Room room = new Room("Madison Square Garden", 100000);
        room.addUser(userOne);
        room.addUser(userTwo);
        System.out.println(room.toString());
    }
}
