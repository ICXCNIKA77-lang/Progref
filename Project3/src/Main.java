import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Vehicles Type: ");
        String AccidentVehicleType = scanner.nextLine();
        System.out.println("Enter the city of the accident: ");
        String City = scanner.nextLine();
        System.out.println("Enter the total accidents: ");
        int  AccidentTotal = scanner.nextInt();

        RoadAccidentsReport roadAccidentsReport = new RoadAccidentsReport(AccidentVehicleType, City, AccidentTotal);
        roadAccidentsReport.printAccidentReport();



    }
}