import java.util.Scanner;

public class HomeConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter plot length (in feet): ");
        int plotLength = scanner.nextInt();
        System.out.print("Enter plot breadth (in feet): ");
        int plotBreadth = scanner.nextInt();
        int totalPlotArea = plotLength * plotBreadth;

        System.out.print("Enter house facing (North, East, South, West): ");
        String houseFacing = scanner.next();

        // Room areas and dimensions
        int masterBedroomArea = 0, masterBathroomArea = 0;
        int bedroom1Area = 0, bathroom1Area = 0, bedroom2Area = 0, bathroom2Area = 0;
        int hallArea = 0, kitchenArea = 0, porticoArea = 0;
        String porticoFor = "Bike";

        int masterBedLength = 0, masterBedWidth = 0;
        int masterBathLength = 0, masterBathWidth = 0;

        int bed1Length = 0, bed1Width = 0;
        int bath1Length = 0, bath1Width = 0;

        int bed2Length = 0, bed2Width = 0;
        int bath2Length = 0, bath2Width = 0;

        int hallLength = 0, hallWidth = 0;
        int kitchenLength = 0, kitchenWidth = 0;
        int porticoLength = 0, porticoWidth = 0;

        // Room allocation based on total area
        if (totalPlotArea <= 800) {
            hallArea = 224; hallLength = 16; hallWidth = 14;
            masterBedroomArea = 176; masterBedLength = 11; masterBedWidth = 16;
            masterBathroomArea = 64; masterBathLength = 8; masterBathWidth = 8;
            kitchenArea = 80; kitchenLength = 8; kitchenWidth = 10;
            porticoArea = 40; porticoLength = 5; porticoWidth = 8;
            porticoFor = "Bike";
        } else if (totalPlotArea <= 1200) {
            hallArea = 260; hallLength = 13; hallWidth = 20;
            masterBedroomArea = 220; masterBedLength = 11; masterBedWidth = 20;
            masterBathroomArea = 70; masterBathLength = 7; masterBathWidth = 10;
            bedroom1Area = 150; bed1Length = 10; bed1Width = 15;
            bathroom1Area = 35; bath1Length = 5; bath1Width = 7;
            kitchenArea = 85; kitchenLength = 8; kitchenWidth = 10;
            porticoArea = 50; porticoLength = 5; porticoWidth = 10;
            porticoFor = "Bike";
        } else {
            hallArea = 300; hallLength = 15; hallWidth = 20;
            masterBedroomArea = 265; masterBedLength = 13; masterBedWidth = 20;
            masterBathroomArea = 80; masterBathLength = 8; masterBathWidth = 10;
            bedroom1Area = 160; bed1Length = 10; bed1Width = 16;
            bathroom1Area = 40; bath1Length = 5; bath1Width = 8;
            bedroom2Area = 160; bed2Length = 10; bed2Width = 16;
            bathroom2Area = 40; bath2Length = 5; bath2Width = 8;
            kitchenArea = 100; kitchenLength = 10; kitchenWidth = 10;
            porticoArea = 100; porticoLength = 10; porticoWidth = 10;
            porticoFor = "Car";
        }

        int totalUsedArea = hallArea + masterBedroomArea + masterBathroomArea +
                bedroom1Area + bathroom1Area + bedroom2Area + bathroom2Area +
                kitchenArea + porticoArea;

        int unusedArea = totalPlotArea - totalUsedArea;

        // Output
        System.out.println("\n--- House Plan ---");
        System.out.println("Total Plot Area: " + totalPlotArea + " sqft");

        System.out.println("\nHall: " + hallArea + " sqft (" + hallLength + "' x " + hallWidth + "')");

        System.out.println("Master Bedroom: " + masterBedroomArea + " sqft (" + masterBedLength + "' x " + masterBedWidth + "')");
        System.out.println("  Master Bathroom: " + masterBathroomArea + " sqft (" + masterBathLength + "' x " + masterBathWidth + "')");

        if (bedroom1Area > 0) {
            System.out.println("Bedroom 1: " + bedroom1Area + " sqft (" + bed1Length + "' x " + bed1Width + "')");
            System.out.println("  Bathroom 1: " + bathroom1Area + " sqft (" + bath1Length + "' x " + bath1Width + "')");
        }

        if (bedroom2Area > 0) {
            System.out.println("Bedroom 2: " + bedroom2Area + " sqft (" + bed2Length + "' x " + bed2Width + "')");
            System.out.println("  Bathroom 2: " + bathroom2Area + " sqft (" + bath2Length + "' x " + bath2Width + "')");
        }

        System.out.println("Kitchen: " + kitchenArea + " sqft (" + kitchenLength + "' x " + kitchenWidth + "')");
        System.out.println("Portico (" + porticoFor + "): " + porticoArea + " sqft (" + porticoLength + "' x " + porticoWidth + "')");
        System.out.println("Unused Area: " + unusedArea + " sqft");

        // Vastu
        System.out.println("\n--- Vastu Recommendations ---");
        switch (houseFacing.toLowerCase()) {
            case "north":
                System.out.println("Main Door: North or Northeast");
                System.out.println("Kitchen: Southeast");
                System.out.println("Master Bedroom: Southwest");
                System.out.println("Other Bedrooms: Northwest");
                System.out.println("Bathroom: West or Northwest");
                break;
            case "east":
                System.out.println("Main Door: East or Northeast");
                System.out.println("Kitchen: Southeast");
                System.out.println("Master Bedroom: Southwest");
                System.out.println("Other Bedrooms: Northwest");
                System.out.println("Bathroom: West or Northwest");
                break;
            case "south":
                System.out.println("Main Door: South or Southeast");
                System.out.println("Kitchen: Northwest");
                System.out.println("Master Bedroom: Southwest");
                System.out.println("Other Bedrooms: Northeast");
                System.out.println("Bathroom: South or West");
                break;
            case "west":
                System.out.println("Main Door: West or Northwest");
                System.out.println("Kitchen: Southeast or Northwest");
                System.out.println("Master Bedroom: Southwest");
                System.out.println("Other Bedrooms: Northeast");
                System.out.println("Bathroom: South or Northwest");
                break;
            default:
                System.out.println("Facing not recognized. Try North, South, East, or West.");
        }

        scanner.close();
    }
}
