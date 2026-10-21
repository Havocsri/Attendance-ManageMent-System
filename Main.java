import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("1. Add Attendance");
        System.out.println("2. View Attendance");
        System.out.println("3. Update Attendance");
        System.out.println("4. Delete Attendance");
        System.out.println("5. search attendance ");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        int choice=input.nextInt();
        switch(choice){
            case 1:
                //add attendance
                System.out.println("enter Student Id: ");
                int id=input.nextInt();
                input.nextLine();

                System.out.println("enter Student Name: ");
                String name=input.nextLine();

                System.out.println("enter Student Age: ");
                int age=input.nextInt();
                input.nextLine();

                System.out.println("Enter Attendance status (PRESENT / ABSENT / LATE): ");
                String attendancestatus=input.nextLine();

                break;

            case 2:
                 //view attendance

            case 3:
                //update student
                 System.out.println("enter student id to update: ");
                 int update=input.nextInt();
                 input.nextLine();

                 System.out.println("enter new attendance status: ");
                 String newstatus=input.nextLine();

                 break;

            case 4:
                  //delete id
                  System.out.println("enter student id to delete: ");
                  int delete=input.nextInt();
                  input.nextLine();
                  break;

            case 5:
                //search id
                System.out.println("enter student id to search: ");
                int search=input.nextInt();
                input.nextLine();
                break;

            case 6:
                    System.out.println("exit");
                    break;

            default:
                     System.out.println("Invalid choice");

        }
        input.close();
   }
}
