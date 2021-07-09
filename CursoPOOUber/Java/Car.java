package Java;


class Car { //variables globales con respecto a la clase
    private Integer id;
    private String license;
    private Account driver; //Driver hereda de account
    protected Integer passengers; //Modificador de clase, si no se agrega queda como default.

    public Car(String license, Account driver) /*parametros obligatorios declarados de manera local al método*/{
        //Método constructor
        this.license = license;
        this.driver = driver;

    }
    
    void printDataCar() {
        //función para imprimir la licencia
        if (passengers != null) {
            System.out.println("License: " + license + " Driver name: " + driver.name + " Passengers: " + passengers);
        } 
        
    }

    //Métodos para alterar dato passengers dentro de la clase.
    public Integer getPassenger() {
        return passengers;
    }

    public void setPassenger(Integer passengers){
        if(passengers == 4){
            this.passengers = passengers;}
            else{
                System.out.println("Necesistas asignar cuatro pasajeros");
            }


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

}
