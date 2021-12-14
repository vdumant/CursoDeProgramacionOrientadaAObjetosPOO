from account import Account
from car import Car
if __name__ == "__main__":
    # print("Hola mundo")
    car = Car("ubc123", Account("Andres herrera", "sdfdsfs"))
    print(vars(car))
    print(vars(car.driver))
