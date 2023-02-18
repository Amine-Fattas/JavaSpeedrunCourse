package oop.a_classes_encapsulation;

import java.util.*;

class Client {
    int roomNumber;
    String name;

    Client(int roomNumber, String name) {
        this.roomNumber = roomNumber;
        this.name = name;
    }
}

class Exercise2 {

    static void print(String text) {
        System.out.println(text);
    }

    static ArrayList<Client> dataObjects = new ArrayList<Client>(Arrays.asList(
            new Client(101, "Hakimi"),
            new Client(102, "Saiss"),
            new Client(104, "Ziyech"),
            new Client(202, "Ounahi"),
            new Client(205, "Nesyri"),
            new Client(211, "Bono"),
            new Client(303, "Yamiq"),
            new Client(304, "Boufal"),
            new Client(310, "Regragui"),
            new Client(404, "Amrabat")
    ));

    public static void main(String[] args) {
        ArrayList<Client> clientsStartingWithB = getPlayerStartingWith('B');
        for (Client client: clientsStartingWithB) {
            System.out.println(client.name);
        }
    }

    static void printPlayers() {
        dataObjects.sort(new Comparator<Client>(){
            @Override
            public int compare(Client client1, Client client2) {
                return Integer.compare(client1.roomNumber, client2.roomNumber);
            }
        });

        for (Client client: dataObjects) {
            print("Room: " + client.roomNumber + ", Client: " + client.name);
        }
    }

    // C
    static Client getPlayerInRoom(int roomNumber) {
        for (Client client: dataObjects) {
            if (client.roomNumber == roomNumber) return client;
        }
        return null;
    }

    static Client getPlayerNamed(String name) {
        for (Client client: dataObjects) {
            if (client.name == name) return client;
        }
        return null;
    }

    // D
    static void replacePlayer(String oldPlayer, String newPlayer) {
        getPlayerNamed(oldPlayer).name = newPlayer;
    }

    // E
    static void replaceRoomOfClient(String clientName, int newRoom) {
        if (getPlayerInRoom(newRoom) != null) return;
        getPlayerNamed(clientName).roomNumber = newRoom;
    }

    // F
    static ArrayList<Client> getPlayerStartingWith(char motif) {
        dataObjects.removeIf( client -> client.name.charAt(0) != motif);
        return dataObjects;
    }
}
