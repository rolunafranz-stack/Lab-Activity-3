public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Audi", "R8", 2020);
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vintage? " + v1.isVintage());

        System.out.println();

        Vehicle v2 = new Vehicle("Mazda", "RX-7", 2002);
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vintage? " + v2.isVintage());

        System.out.println();

        Vehicle v3 = new Vehicle("Ford", "Model T", 1925);
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vintage? " + v3.isVintage());
    }
}
