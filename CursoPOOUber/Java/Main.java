package Java;

class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    Car car = new Car("amq123",new Account("Andres herrera", "12345678")); 
    // car.passenger = 4;
    
    car.printDataCar();

    UberVan uberVan = new UberVan("dfg435", new Account("Andres herrera", "12345678"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();
  }
}
