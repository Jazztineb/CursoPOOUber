package Java;

import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    

    public UberVan(String license, Account driver){
        super(license, driver);
        
    }

    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
    @Override //sobreescribiendo metodo que proviene de la clase padre car, esto es polimorfismo
    public void setPassenger(Integer passengers) {
        if(passengers == 6){
            this.passengers = passengers;}
            else{
                System.out.println("Necesistas asignar seis pasajeros.");
            }
    }
}