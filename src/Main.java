import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double convertPoundToKg(double poundValue) {
        return poundValue * 0.454d;
    }

    static double convertKgToPound(double kgValue) {
        return kgValue * 2.205d;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isProgramRunning = true;

        while (isProgramRunning) {
            System.out.println("Choose operation");
            System.out.println("============================");
            System.out.println("1. Convert Kilogram to Pound");
            System.out.println("2. Convert Pound to Kilogram");


            boolean isInputOperationValid = true;
            while (isInputOperationValid) {

                try {
                    System.out.println("Choose your operation : ");
                    int convertOperation = Integer.parseInt(scanner.nextLine());

                    if (convertOperation == 1) {
                        boolean isInputKgValid = true;
                        while (isInputKgValid) {
                            System.out.println("Input your number (Kilogram) : ");
                            try {
                                double userInputKgNumber = Double.parseDouble(scanner.nextLine());
                                System.out.println(userInputKgNumber + " Kilogram" + " is equal to " + convertKgToPound(userInputKgNumber) + " pound");
                                isInputKgValid = false;
                                isInputOperationValid = false;
                            } catch (Exception e) {
                                System.out.println("Input must be number!");
                                isInputKgValid = true;
                            }
                        }
                    } else if (convertOperation == 2) {
                        boolean isInputPoundValid = true;
                        while (isInputPoundValid) {
                            System.out.println("Input your number (Pound) : ");
                            try {
                                double userInputPoundNumber = Double.parseDouble(scanner.nextLine());
                                System.out.println(userInputPoundNumber + " Pound" + " is equal to " + convertPoundToKg(userInputPoundNumber) + " kilogram");
                                isInputPoundValid = false;
                                isInputOperationValid = false;
                            } catch (Exception e) {
                                System.out.println("Input must be number!");
                                isInputPoundValid = true;
                            }
                        }
                    } else {
                        System.out.println("Input operation not valid!");
                    }
                } catch (Exception e) {
                    System.out.println("Input operation not valid!");
                }
            }

            boolean isInputRestartProgramValid = true;
            while (isInputRestartProgramValid) {
                System.out.println("============================");
                System.out.println("Restart program? (y/n)");
                String userInput = scanner.nextLine();
                if (userInput.toLowerCase(Locale.ROOT).equals("y")) {
                    isInputRestartProgramValid = false;
                } else if (userInput.toLowerCase(Locale.ROOT).equals("n")) {
                    isInputRestartProgramValid = false;
                    isProgramRunning = false;
                    System.out.println("Thank you for using this program ❤️");
                } else {
                    System.out.println("Input not valid, please input \"y\" for restart the program or \"n\" to terminate the program");
                }
            }
        }
    }
}