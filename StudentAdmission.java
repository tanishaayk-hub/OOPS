import java.util.Scanner;

public class StudentAdmission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        String dep = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percent = sc.nextDouble();

        System.out.println("\n----- STUDENT DETAILS -----");

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + dep);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percent + "%");

        sc.close();
    }
}