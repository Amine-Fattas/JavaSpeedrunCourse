package basics.h_practice;

import jdk.nashorn.internal.ir.EmptyNode;
import java.util.*;

class Exercise1 {

    static void print(String text) {
        System.out.println(text);
    }

    // A
    static HashMap<Integer, String> data = new HashMap() {{
        put(101, "Hakimi");
        put(102, "Saiss");
        put(104, "Ziyech");
        put(202, "Ounahi");
        put(205, "Nesyri");
        put(211, "Bono");
        put(303, "Yamiq");
        put(304, "Boufal");
        put(310, "Regragui");
        put(404, "Amrabat");
    }};

    public static void main(String[] args) {

    }

    // B
    static void printPlayers() {
        ArrayList<Integer> keyArray = new ArrayList<>(data.keySet());
        Collections.sort(keyArray);
        for (int key: keyArray) {
            print("Room: " + key + ", Client: " + data.get(key));
        }
    }

    // C
    static String getPlayerInRoom(int roomNumber) {
        return Exercise1.data.get(roomNumber);
    }

    // D
    static void replacePlayer(String oldPlayer, String newPlayer) {
        for (int key : Exercise1.data.keySet()) {
            if (Exercise1.data.get(key).equals(oldPlayer)) {
                Exercise1.data.replace(key, newPlayer);
                break;
            }
        }
    }

    // E
    static void replaceRoomOfClient(String client, int newRoom) {
        if (!data.containsValue(client)) {
            print("This client does not exist");
            return;
        }

        for (int key : Exercise1.data.keySet()) {
            if (Exercise1.data.get(key).equals(client)) {
                if (data.containsKey(newRoom)) {
                    print("This room is already occupied");
                }
                else {
                    data.put(newRoom, data.get(key));
                    data.remove(key);
                }
                break;
            }
        }
    }

    // F
    static ArrayList<String> getPlayerStartingWith(char motif) {
        ArrayList<String> result = new ArrayList<String>();

        for(String player: data.values()){
            if (player.charAt(0) == motif) {
                result.add(player);
            }
        }

        return result;
    }
}
