public class Main {
public static void main(String[] args) {
       Vehicle v1 = new Vehicle("Ford", "Mustang", 1967);
       v1.displayInfo();
       System.out.println("Age: ", + v1.calculateAge());
       System.out.println("Vintage: ", + v1.isVintage());
       System.out.println();
       
       Vehicle v2 = new Vehicle("Honda", "Civic", 2010);
       v2.displayInfo();
       System.out.println("Age: ", + v2.calculateAge());
       System.out.println("Vintage: ", + v2.isVintage());
       System.out.println();

       Vehicle v3 = new Vehicle("Essex", "Super Six Four-Door Suddan", 1928);
       v3.displayInfo();
       System.out.println("Age: ", + v3.calculateAge());
       System.out.println("Vintage: ", + v3.isVintage());
       System.out.println();

    }
}
