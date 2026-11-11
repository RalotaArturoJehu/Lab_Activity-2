class Motorcycle extends Vehicle implement Serviceable {
  

   private String engineType;
   
   public Motorcycle(String brand, String model, int year, String engineType) {
      super(brand, model, year);
      this.engineType = engineType;
   }
   
   @Override 
   public void displayInfo() {
   super.displayInfo();
   System.out.println("Engine Type: " + engineType);
   }

  @Override
  public void moveForward() {
   System.out.println("A motorcycle moves forward");
  }

    @Override
  public void moveBackward() {
   System.out.println("A motorcycle moves backward");
  }

    @Override
  public void moveRight() {
   System.out.println("A motorcycle moves right");
  }

    @Override
  public void moveLeft() {
   System.out.println("A motorcycle moves left");
  }

  public void service();
  {
    System.out.println("Check the engine oil, tire, and brakes");
  }
}
