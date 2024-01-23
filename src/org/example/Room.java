package org.example;

public class Room {
    private int width;
    private int length;

    public Room(int w, int l){
        this.width =w;
        this.length=l;

    }
    public void computePrice(float price){
        float sqYard=(width*length)/9;
        float amt=sqYard*price;
        System.out.println("carpeting price "+amt);

    }// end method

    public static void main(String[] args){
        Room room = new Room(42,25);
        room.computePrice(10.5f);
    }
}
