import java.util.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("<<<===WELCOME TO Speed Trail Bike Showroom ====>>>");
        System.out.println();
        System.out.print("ENTER YOUR CHOICE: ");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS");
        System.out.println("2].REMOVE SHOWROOM");
        System.out.println("3].ADD EMPLOYEES");
        System.out.println("4].REMOVE EMPLOYEE");
        System.out.println("5].ADD Bike");
        System.out.println("6].REMOVE Bike");
        System.out.println("7].SHOWROOM Details");
        System.out.println("8].EMPLOYEES Detail");
        System.out.println("9].Bike Details");
        System.out.println();
        System.out.print("ENTER 0 TO EXIT => ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Showroom> showrooms = new ArrayList<>();
        ArrayList<Employees> employees = new ArrayList<>();
        ArrayList<Bike> bikes = new ArrayList<>();
        int choice = 100;

        while(choice != 0) {
            main_menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Showroom showroom = new Showroom();
                    showroom.set_details();
                    showrooms.add(showroom);
                    System.out.println("Showroom added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Showroom Name to Remove: ");
                    sc.nextLine();  // consume newline
                    String showroomNameToRemove = sc.nextLine();
                    showrooms.removeIf(s -> s.showroom_name.equals(showroomNameToRemove));
                    System.out.println("Showroom removed successfully!");
                    break;
                case 3:
                    Employees employee = new Employees();
                    employee.set_details();
                    employees.add(employee);
                    System.out.println("Employee added successfully!");
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Remove: ");
                    sc.nextLine();  // consume newline
                    String employeeIdToRemove = sc.nextLine();
                    employees.removeIf(e -> e.emp_id.equals(employeeIdToRemove));
                    System.out.println("Employee removed successfully!");
                    break;
                case 5:
                    Bike bike = new Bike();
                    bike.set_details();
                    bikes.add(bike);
                    System.out.println("Bike added successfully!");
                    break;
                case 6:
                    System.out.print("Enter Bike Name to Remove: ");
                    sc.nextLine();  // consume newline
                    String bikeNameToRemove = sc.nextLine();
                    bikes.removeIf(b -> b.bike_name.equals(bikeNameToRemove));
                    System.out.println("Bike removed successfully!");
                    break;
                case 7:
                    for (Showroom s : showrooms) {
                        s.get_details();
                        System.out.println();
                    }
                    break;
                case 8:
                    for (Employees e : employees) {
                        e.get_details();
                        System.out.println();
                    }
                    break;
                case 9:
                    for (Bike b : bikes) {
                        b.get_details();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
            }
        }
        sc.close();
    }
}
