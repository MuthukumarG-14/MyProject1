import java.util.Scanner;

public class FitnessPlanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double heightCm = scanner.nextDouble();

        // Calculate BMI
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        // Determine BMI Category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Print summary
        System.out.println("\n--- Fitness Report for " + name + " ---");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);

        System.out.println("\n--- Workout Plan ---");

        // Based on age
        if (age > 60) {
            System.out.println("Daily Recommendation: Walk for 30 to 45 minutes.");
        } else if (age < 10) {
            System.out.println("Daily Recommendation: Outdoor games/play for at least 1 hour.");
        } else {
            // Days of the week
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println("Workout Plan (Monday to Saturday):");

            for (String day : days) {
                System.out.print(day + ": ");
                switch (category) {
                    case "Underweight":
                        printUnderweightWorkout(day);
                        break;
                    case "Normal weight":
                        printNormalWorkout(day);
                        break;
                    case "Overweight":
                        printOverweightWorkout(day);
                        break;
                    case "Obese":
                        printObeseWorkout(day);
                        break;
                }
            }
            System.out.println("Sunday: Rest day 🧘‍♂️");
        }

        scanner.close();
    }

    // Workouts for each BMI Category
    public static void printUnderweightWorkout(String day) {
        switch (day) {
            case "Monday": System.out.println("Bodyweight squats + high-protein food"); break;
            case "Tuesday": System.out.println("Push-ups + calorie-rich snacks"); break;
            case "Wednesday": System.out.println("Resistance band training"); break;
            case "Thursday": System.out.println("Light dumbbell curls + eggs"); break;
            case "Friday": System.out.println("Lunges + banana shake"); break;
            case "Saturday": System.out.println("Planks + healthy snacks"); break;
        }
    }

    public static void printNormalWorkout(String day) {
        switch (day) {
            case "Monday": System.out.println("30 mins jogging + 15 mins stretching"); break;
            case "Tuesday": System.out.println("Bodyweight strength workout"); break;
            case "Wednesday": System.out.println("Cycling or dancing for 40 mins"); break;
            case "Thursday": System.out.println("Cardio + dumbbell lifts"); break;
            case "Friday": System.out.println("Yoga + deep breathing"); break;
            case "Saturday": System.out.println("HIIT (High-Intensity Interval Training)"); break;
        }
    }

    public static void printOverweightWorkout(String day) {
        switch (day) {
            case "Monday": System.out.println("40 mins brisk walking"); break;
            case "Tuesday": System.out.println("Low-impact strength training"); break;
            case "Wednesday": System.out.println("Cycling for 30 mins"); break;
            case "Thursday": System.out.println("Step-ups + squats"); break;
            case "Friday": System.out.println("Core strengthening exercises"); break;
            case "Saturday": System.out.println("Walking + yoga stretches"); break;
        }
    }

    public static void printObeseWorkout(String day) {
        switch (day) {
            case "Monday": System.out.println("Slow walking for 45 mins"); break;
            case "Tuesday": System.out.println("Chair squats + stretching"); break;
            case "Wednesday": System.out.println("Seated leg lifts + wall push-ups"); break;
            case "Thursday": System.out.println("Gentle yoga + deep breathing"); break;
            case "Friday": System.out.println("Resistance band stretching"); break;
            case "Saturday": System.out.println("Light aerobic movements"); break;
        }
    }
}
