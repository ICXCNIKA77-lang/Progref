import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current estate agent name: ");
        String AgentName = scanner.nextLine();
        System.out.println("Enter the property price: ");
        double PropertyPrice = scanner.nextDouble();

        EstateAgentSales estateAgentSales = new EstateAgentSales(AgentName, PropertyPrice);
        estateAgentSales.printPropertyReport();

        }
    }
