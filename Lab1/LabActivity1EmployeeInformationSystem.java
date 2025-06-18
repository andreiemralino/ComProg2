import java.util.Scanner;

class LabActivity1EmployeeInformationSystem {
    public static void main(String[] args) {

        /*dito kaya System.In yung nakalagay para malaman na ang susundin ng code is yung iiinput ng users.
*/
        Scanner scanner = new Scanner(System.in);
        /*nextLine since String yung data type nya. Pag nextInt naman integers kasi numbers.
*/
        System.out.print("Enter your first name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        
        System.out.print("Enter hourly wage: ");
        double hoursWage = scanner.nextDouble();
        /* Para makuha yung daily salary is need mong imultiply ang hours worked at hours wage
*/
        double dailySalary = ( hoursWorked * hoursWage);
        
        /*(\n) para mag proceed sa next line yung code
*/
        System.out.println("\n Employee Information");
        System.out.println("---------------------");
        /* Nilagyan ko po ng("") para magkaron ng spacing yung first and last name. Sa age naman nilagay ko sa dulo yung naka quotation para after ng users input is nakaprint na yung years old.
*/
        System.out.println("Full Name   : " + name + " " + lastName);
        System.out.println("Age         : " + age   +   " years old");
        System.out.println("Daily Salary: PHP " + dailySalary);
        
        
        scanner.close();
        
    }
}
