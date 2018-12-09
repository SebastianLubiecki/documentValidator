import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type which document you want to validate, PESEL, ID or EXIT: ");
        String typeOfDocument ="";
        while (!typeOfDocument.equals("EXIT")) {
             typeOfDocument = scanner.nextLine();
            if (typeOfDocument.equals("PESEL")) {
                try {
                    PESELValidate peselValidate = new PESELValidate();
                    System.out.print("Please type PESEL number to validate:");
                    String typedPeselTOValidate = scanner.nextLine();
                    System.out.println("Typed PESEL is: " + peselValidate.validation(typedPeselTOValidate));
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong number of document");
                }
            }
            if (typeOfDocument.equals("ID")) {
                try {
                    IdValidate idValidate = new IdValidate();
                    System.out.print("Please type ID number to validate:");
                    String typedIDTOValidate = scanner.nextLine();
                    System.out.println("Typed ID is: " + idValidate.validation(typedIDTOValidate));
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong number of document");
                }
            }else
                System.out.println("Wrong parameters try again: ");

        }

    }
}