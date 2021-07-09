package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundito");

        //Objeto car
        UberX uberX  = new UberX("AMQ123", new Account("Raúl Gerardo Chan", "RGC123"), "Honda", "Hondita");
        uberX.setPassenger(4);
        uberX.printDataCar();
        //uberX.passengers = 3;
        //System.out.println("Car License: "+ car.license);

        UberVan uberVan = new UberVan("AMCS123", new Account("Ana Maria Cortez Sanchez", "AMCS321"));
        uberVan.setPassenger(3);
        uberVan.printDataCar();

        //Objeto car2
        /*
        Car car2 = new Car("JBC123", new Account("Angel Briceño Cortez", "ABC123"));
        car2.passengers = 2;
        car2.printDataCar();*/
        //System.out.println("Car License " + car2.license);
    }
    
}
