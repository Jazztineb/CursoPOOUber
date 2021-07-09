from account import Account
class Car:
    id = int
    license = str
    driver = Account("","") #Driver hereda de account
    passengers = int

    def __init__(self, license, driver): #Método constructor.
        self.license    = license
        self.driver     = driver

