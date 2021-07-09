<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberVan.php');


$uberX = new UberX("ABC123", new Account("Angel Briceño Cortez", "ABC321"), "Monk", "Bicicleta");
$uberX->setPassenger(4);
$uberX->printDataCar();

//$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Attitude");
//$uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Gerardo", "RGC123"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

//$car = new car("MABS123", new account ("Miguel Angel Briceño Silva", "MABS321"));
//$car -> PrintDataCar(); 

?>