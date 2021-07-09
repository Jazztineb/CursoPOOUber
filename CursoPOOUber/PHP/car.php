<?php
require_once('account.php');


class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger; 

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "
            Licencia: $this->license 
            Driver: {$this->driver->name} 
            Número de amixes pasajeros: $this->passenger
    
        ";
    }

    public function getPassenger(){ //Getter
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar cuatro pasajeros";
        }
    
    }
}
?>