package Java;

class UberX extends Car {
    String brand;
    String model;

    //Método constructor heredado de la clase Car.java
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); //super hace refrencia a atributos y metodos de la super clase.
        this.brand = brand;     //this hace referencia a la clase hija donde se esta ubicado -> UberX
        this.model = model;
    }

    @Override //Sobreescribimos método =  polimorfismo.
    void printDataCar() {
        
        super.printDataCar();
        
    }
}