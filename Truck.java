class Truck extends Vehicle implement Serviceable {

   private int numberOfWheels;
   
   public Truck(String brand, String model, int year, int numberOfWheels) {
      super(brand, model, year);
      this.numberOfWheels = numberOfWheels;
   }
   
   @Override 
   public void displayInfo() {
   super.displayInfo();
   System.out.println("Number of Wheels: " + numberOfWheels);
   }

    @Override
  public void moveForward() {
   System.out.println("A truck moves forward");
  }

  @Override
  public void moveBackward() {
   System.out.println("A truck moves backward");
  }

  @Override
  public void moveRight() {
   System.out.println("A truck moves right");
  }

  @Override
  public void moveLeft() {
   System.out.println("A truck moves left");
  }

  public void service() {
    System.out.println("Check the engine, oil, tires and brakes");
  }
}
