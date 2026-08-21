import java.util.Scanner;

public class ass_main_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n|||||MENU |||||");
            System.out.println("1. Display Employee");
            System.out.println("2. Display Manager");
            System.out.println("3. Display Developer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            

            switch (choice) {

                case 1:
                    employee e = new employee("AADI", 23201, 200);
                    e.display_data();
                    break;

                case 2:
                    Manager m = new Manager("AYAAN", 23210, 50000, 10000);
                    m.display_data();
                    break;

                case 3:
                    Developer d = new Developer("ASHISH", 1001, 5000, 1000);
                    d.addSkill("python");
                    d.addSkill("DBMS", 3);
                    d.addSkill("DBMS", "EXPERT");
                    d.display_data();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}