package com.example.demo;

public class Main {
    public static Recepcionist recepcionist = new Recepcionist();
    public static Lectura scan = new Lectura();

    public static void main(String[] args){
        System.out.println("Bienvenido, que desea realizar:");

        boolean continuar = true;
        do{
            int option = scan.valInt("1.Añadir habitaciones\n" +
                    "2.Consultar las habitaciones disponibles y ocupadas \n"+
                    "3.Consultar la cantidad de dinero recaudada durante el turno \n"+
                    "4.salir \n");
            continuar = menu(option);

        }while(continuar);

    }

    public static boolean menu(int option){
        boolean continuar = true;
        switch (option){
            case 1:
                createRooms();
                break;
            case 2:
                consultOcuppied();
                break;
            case 3:
                consultBill();
                break;
            case 4:
                continuar = false;
                break;
            default:
                System.out.println("Por favor ingrese un nuemro del 1 al 4");
                break;
        }

        return continuar;
    }

    public static boolean roomExist(){
        if(recepcionist.hotel.rooms.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public static void consultOcuppied(){
        if(!roomExist()){
            System.out.println("error, aun no hay habitaciones registradas");
        }else{
            System.out.println(recepcionist.checkRoomAbailability());
        }
    }

    public static void consultBill(){
        if(!roomExist()){
            System.out.println("error, aun no hay habitaciones registradas");
        }else{
            System.out.println("La cantidad total de dinero generado durante el dia fue de: "+recepcionist.generateBill());
        }
    }

    public static boolean valHabitacion(String mensaje){
        int estado = 0;
        do{
            estado = scan.valInt(mensaje);
            if (estado != 1 && estado != 2){
                System.out.println("por favor ingrese el valor 1 para habiatciones ocupadas o 2 para habitaciones libres");
            }
        }while(estado != 1 && estado != 2);

     return stateRoom(estado);
    }

    public static boolean stateRoom(int value){
        boolean state = true;

        switch (value){
            case 1:
                state = true;
                break;
            case 2:
                state = false;
                break;
        }
        return state;
    }
    public static Room agregateRoom(){
        Room roomAux = new Room();

        int auxIdRoom = scan.valInt("ingrese el id de la habitacion: ");
        roomAux.setRoomId(auxIdRoom);

        double auxPricePerDay = scan.valDouble("ingrese el precio al dia de la habitacion: ");
        roomAux.setPricePerDay(auxPricePerDay);

        boolean auxOccupied = valHabitacion("ingrese el estado de la habitacion, [1] si esta ocupada, [2] si esta libre: ");
        roomAux.setOccupied(auxOccupied);

        return roomAux;
    }

    public static void createRooms(){
        int numRooms = scan.valInt("Ingrese el numero de habitaciones que desesa agregar: ");
        for (int i = 0; i<numRooms; i++){
            recepcionist.hotel.rooms.add(agregateRoom());
        }
        System.out.println("las habitaciones fueron registradas con exito");
    }


}
