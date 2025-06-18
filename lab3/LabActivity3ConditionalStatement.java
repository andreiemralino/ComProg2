import java.util.Scanner;
 
 class LabActivity3ConditionalStatement {
     public static void main(String[] args) {
 
         /*dito kaya System.In yung nakalagay para malaman na ang susundin ng code is yung iiinput ng users.
 */
         Scanner scanner = new Scanner(System.in);
         /*nextLine since String yung data type nya. Pag nextInt naman integers kasi numbers.
 */
         System.out.print("Enter your first name: ");
         String name = scanner.nextLine();
         
         System.out.print("Enter your last name : ");
         String lastName = scanner.nextLine();
         
         System.out.print("Enter your age       : ");
         int age = scanner.nextInt();
         /* Dito ginawa ko  pag less than 18 ung bata is mag piprint sya ng Minors are not allowed tapos nag system exit ako para hindi na mag tuloy tuloy yung code */ 
        if (age < 18) {
          System.out.println("\n");
            System.out.println("--Minors are not allowed--");
            System.exit(0);
}
        if (age > 65) {
          System.out.println("\n"); 
            System.out.println("--Senior Citizens are not allowed--");
            System.exit(0);
        
}
        
         System.out.print("Enter hours worked   : ");
         double hoursWorked = scanner.nextDouble();
         
         if (hoursWorked > 24) {
          System.out.println("\n");
            System.out.println("--Number of hours worked cannot exceed 24 hours--");
            System.exit(0);
}
        if (hoursWorked == 0) {
          System.out.println("\n");
            System.out.println("--Wrong input on daily work hours--");
            System.exit(0);
}
         
         System.out.print("Enter hourly wage    : ");
         double hoursWage = scanner.nextDouble();
         
          
         /* Para makuha yung daily salary is need mong imultiply ang hours worked at hours wage
 */
         /* ginamitan ko ng math.abs para malaman ng coding na hanggang 65 lang ung age na ininput ko. Pag lumagpas sya sa 65 bibilangin nya ung years of retirement ng employee
         */
         
         if (hoursWorked > 24) {
            System.out.println("--Number of hours worked cannot exceed 24 hours--");
            System.exit(0);
}
        if (hoursWorked == 0) {
            System.out.println("--Wrong input on daily work hours--");
            System.exit(0);
}
       
        System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern):");
         int roleCode = scanner.nextInt();
        /* dito naman gumamit ako ng swith kasi 3 pataas na yung pag pipilian. Role ang nilagay ko kasi nag tanong ako sa chat gpt ayaw po kasi gumana ng return. Tapos break kada case para din hindi sya mag tuloy tuloy*/
    String role;
        switch (roleCode) { 
            case 1:
                role = "Manager";
                break;
            case 2:
                role = "Supervisor";
                break;
            case 3:
                role = "Staff";
                break;
            case 4:
                role = "Intern";
                break;
            default:
                role = "Undefined";
                break;
        }
        
          int ageOfRetirement = 65;
          int yearsToRetirement = Math.abs(ageOfRetirement - age);
          
          
          
         double dailySalary = ( hoursWorked * hoursWage);
         double weeklySalary = ( hoursWorked * hoursWage * 5);
         double  monthlySalary = ( weeklySalary * 4);
         double grossYearlySalary = (monthlySalary * 12);
         double netYearlySalary = grossYearlySalary - (0.32 * grossYearlySalary) - 1500;
         
         
         /*(\n) para mag proceed sa next line yung code
 */
         System.out.println("\n");
         System.out.println("\n Employee Information");
         System.out.println("---------------------");
         /* Nilagyan ko po ng("") para magkaron ng spacing yung first and last name. Sa age naman nilagay ko sa dulo yung naka quotation para after ng users input is nakaprint na yung years old.
 */
         System.out.println("Full Name           : " + lastName + ", " + name);
         System.out.println("Age                 : " + age   +   " years old");
         /* Dito tinawag ko ung role kasi ayun ung nakalagay sa string ko para kung ano maging sagot ng user is ayun ung lalabas.*/
         System.out.println("Position            : " + role);
         System.out.println("Years to Retirement : " + yearsToRetirement + " " + "years");
         System.out.println("Daily Salary        : PHP " + dailySalary);
         System.out.println("Weekly Salary       : PHP " + weeklySalary);
         System.out.println("Monthly Salary      : PHP " + monthlySalary);
         System.out.println("Gross Yearly Salary : PHP" + grossYearlySalary);
         System.out.println("Net Yearly Salary   : PHP" + netYearlySalary );
       
         
         scanner.close();
         
     }
