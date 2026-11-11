public abstract class Vehicle implement Serviceable {
    String brand;
    String model;
    int year;

  private String brand;
  private String model;
  private int year;

  Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }

  public abstract void moveForward();
  public abstract void moveBackward();
  public abstract void moveRight();
  public abstract void moveLeft();
}

  public void service() {
    
  }
}
