package com.example.demo;

public class Recepcionist {
    public static Hotel hotel = new Hotel();


    public String checkRoomAbailability() {
        String texto = "";
        int roomID = 0;
        boolean ocupated = false;
        Room room = new Room();

        for(int i = 0; i< hotel.rooms.size(); i++){
            room = hotel.rooms.get(i);

            roomID = room.getRoomId();
            ocupated = room.isOccupied();
            String statateOcupated;
            if(ocupated){
                statateOcupated = "ocupada";
            }else{
                statateOcupated = "disponible";
            }
            texto += ("La habitacion "+ roomID + " esta " + statateOcupated + " \n");
        }

        return texto;
    }

    public double generateBill(){
        double totalPrice = 0;

        for(int i = 0; i< hotel.rooms.size(); i++){
            Room room = hotel.rooms.get(i);

            boolean ocupated = room.isOccupied();

            if(ocupated){
                totalPrice += room.getPricePerDay();
            }

        }

        return totalPrice;
    }



}
