#importa elemento de la clase
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

car = Car("ABC123",Account("Angel Briceño Cortez", "BCA123"))
print(vars(car))
print(vars(car.driver))
    
    

    #car = Car()
    #car.license = "RGC123"
    #car.driver = "Raúl Gerardo Chan"
    #print(vars(car))

    #car2 = Car()
    #car2.license = "JBC123"
    #car2.driver = "Justine Briceno Cortez"
    #print(vars(car2))