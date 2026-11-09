public class Car extends Vehicle {

   private int numberOfDoors;
   
   public Car(String brand, String model, int year, int numberOfDoors) {
      super(brand, model, year);
      this.numberOfDoors = numberOfDoors;
   }
   
   @Override 
   public void displayInfo() {
   super.displayInfo();
   System.out.println("Number of Doors: " + numberOfDoors);
   }

  public void moveForward() {
        System.out.println("Car is moving forward.");
  }
  public void moveBackward() {
        System.out.println("Car is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Car is turning left.");
    }
    public void moveRight() {
        System.out.println("Car is turning right.");
    }

}
