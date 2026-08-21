package Assignment2;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        StudentManagement m = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1.Add Student");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Exit..");
            System.out.println("Enter Choice:");
            ch = sc.nextInt();
            
            try{
            switch(ch) {
                case 1:
                    System.out.println("Enter Id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Dept:");
                    String dept = sc.nextLine();
                    System.out.println("Enter marks:");
                    float marks = sc.nextFloat();
                    sc.nextLine();

                    Student stud = new Student (id,name,dept,marks);
                    m.AddStudent(stud);
                    break;


                    case 2:
                        m.Display();
                        break;

                    case 3:
                        System.out.println("Enter Id:");
                        id = sc.nextInt();
                        m.search(id);
                        break;

                    case 4:
                        System.out.println("Enter ID:");
                         id = sc.nextInt();   
                         System.out.println("Enter New marks:");
                         marks = sc.nextFloat();
                         m.update(id,marks);
                         break;
                         
                    case 5:
                        System.out.println("Enter Id:");
                        id = sc.nextInt();     
                        m.delete(id);
                        break;

                    case 6:
                    System.out.println("Thankyou!!");
                    break;    

                    default:
                        System.out.println("Invalid Choice");

            }
        }
        catch(StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        }
        while (ch!=6); 
    }
    
}
