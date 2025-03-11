import java.util.*;
//Dominic Cruz/ Exe8 / 3/8/25
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int quit = 0;
        while (quit == 0) {
            System.out.println("Is this a Personal Contact? (Y/N) /// If not, it is a Business Contact ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Email: ");
                String email = input.nextLine();

                CollectContacts.addContact(new Contact(name, email));
                System.out.println("Person successfully added!");

                System.out.println("Would you like to add another Personal Contact? (Y/N)");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Would you like to add a Business Contact? (Y/N)");
                    String result = input.nextLine();
                    if (result.equalsIgnoreCase("Y")) {
                        System.out.println("Name: ");
                        String businessName = input.nextLine();
                        System.out.println("Email: ");
                        String businessEmail = input.nextLine();
                        System.out.println("Phone Number: ");
                        String businessPhone = input.nextLine();

                        CollectContacts.addContact(new BusContact(businessName, businessEmail, businessPhone));
                        System.out.println("Business contact added!");
                    }

                    System.out.println("Would you like to add another Business Contact? (Y/N)");
                    String option = input.nextLine();
                    if (option.equalsIgnoreCase("N")) {
                        quit = 1;
                    }
                }
            } else {
                System.out.println("Name: ");
                String businessName = input.nextLine();
                System.out.println("Email: ");
                String businessEmail = input.nextLine();
                System.out.println("Phone Number: ");
                String businessPhone = input.nextLine();

                CollectContacts.addContact(new BusContact(businessName, businessEmail, businessPhone));
                System.out.println("Business contact  added!");

                System.out.println("Would you like to add another Business Contact? (Y/N)");
                String option = input.nextLine();
                if (option.equalsIgnoreCase("N")) {
                    quit = 1;
                }
            }
        }

        System.out.println("\n Contact List ");
        CollectContacts.contactBook();
    }
}
