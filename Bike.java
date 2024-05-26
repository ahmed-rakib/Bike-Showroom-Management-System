import java.util.Scanner;

public class Bike extends Showroom implements utility {
    String bike_name;
    String bike_color;
    String bike_engine_version;
    int bike_price;
    String bike_type;
    String bike_brake;

    @Override
    public void get_details() {
        System.out.println("NAME: " + bike_name);
        System.out.println("COLOR: " + bike_color);
        System.out.println("Engine Version: " + bike_engine_version);
        System.out.println("PRICE: " + bike_price);
        System.out.println("Bike TYPE: " + bike_type);
        System.out.println("Brake: " + bike_brake);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<=== ENTER Bike DETAILS ===>>>");
        System.out.println();
        System.out.print("Bike NAME: ");
        bike_name = sc.nextLine();
        System.out.print("Bike COLOR: ");
        bike_color = sc.nextLine();
        System.out.print("Bike Engine Version(BS4/BS6): ");
        bike_engine_version = sc.nextLine();
        System.out.print("Bike PRICE: ");
        bike_price = sc.nextInt();
        sc.nextLine();
        System.out.print("Bike TYPE(Sports/Cruiser/Touring): ");
        bike_type = sc.nextLine();
        System.out.print("Bike Brake Type(Drum Brake/Disc Brake): ");
        bike_brake = sc.nextLine();
        total_bike_in_stock++;
    }
}
