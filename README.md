 Activity #1: Employee Information System is a simple console-based Java program designed to gather essential employee details—such as first name, last name, age, hours worked,
and hourly wage—and compute their daily salary. It demonstrates foundational Java programming concepts including user input through the Scanner class, variable declarations 
using different data types (String, int, and double), string concatenation for combining names and messages, and basic arithmetic operations for salary computation. Comments 
within the code provide context for each step, such as why nextLine() is used for string input or how to calculate salary using multiplication. The output includes a clear and
formatted summary showing the employee's full name, age (in years), and computed daily salary in PHP. This activity sets the groundwork for understanding user interaction and data
processing in Java applications.

Activity #2: Employee Information System Part 2 is an enhanced version of the initial console-based Employee Information System. In this iteration, the program not only collects
the employee's basic details (first name, last name, age, hours worked, and hourly wage) but also performs more advanced computations. It calculates the daily, weekly, monthly, 
gross yearly, and net yearly salaries. Additionally, it introduces the concept of retirement planning by determining the years remaining until the employee reaches the retirement 
age of 65 using Math.abs(), ensuring a non-negative result even if the user is over 65. The net yearly salary is computed by applying a 32% tax deduction and subtracting ₱1,500 to 
simulate government-mandated benefits. This activity also continues to demonstrate the use of Scanner for input, multiple arithmetic operations, and formatted output display using
descriptive labels. These improvements showcase the application of compound calculations and real-world logic in Java programming, preparing the foundation for even more complex systems.

Activity #3: Employee Information System (Validation and Role Assignment) is the fourth version of the Employee Information System. This version expands on previous functionalities
by including complete input validation and employee role assignment using a switch-case structure. It begins by collecting essential employee details such as first name, last name, age, 
hours worked per day, hourly wage, and a role code. The program checks whether the user is eligible to proceed by validating age (excluding minors under 18 and senior citizens over 65) and
ensures the working hours are within a logical range (1–24 hours). It then determines the employee's position based on a numeric role code, assigning titles like Manager, Supervisor, Staff, or Intern.

Activity #4: Employee Information System (GUI Version) is the fifth version of the Employee Information System, now redesigned with a graphical user interface (GUI) using Java AWT. Instead
of relying on console-based input and output, this version allows users to enter employee details through text fields and view the result in a text area within a windowed application. 
The program collects key employee information such as first name, last name, age, hours worked, and hourly rate.

Activity #5: Java AWT Quiz Application is a simple Java-based multiple-choice quiz application built using the Abstract Window Toolkit (AWT). This activity introduces basic GUI development
in Java while reinforcing core programming concepts such as arrays, event handling, conditionals, and user input validation. The program features a graphical interface with labels, checkboxes,
and buttons arranged in a structured layout to display a series of questions, each with four answer choices.

Activity #6: Java Swing To-Do List Application is a graphical task management system created using Java Swing. This project allows users to view and add tasks in a table format, making it easier
to manage and track daily activities. The main window, titled To-Do List Viewer, displays a scrollable table containing the task name, description, and current status. It utilizes JTable, JScrollPane, 
and DefaultTableModel to structure the task list and allow for dynamic updates.

Midterms:  Ticket Management System is a console-based application designed to simulate an IT support ticketing system. It allows users to add new tickets, update ticket statuses, display all tickets, 
and generate a summary report. The system supports a maximum of five tickets, and each ticket includes a description, urgency level (Low, Medium, or High), and status (Pending, In Progress, or Resolved). 
Input validation ensures that users cannot leave descriptions empty or enter invalid urgency/status values.

Finals: The CalculatorUI program is a Java-based graphical calculator application built using Swing. It extends the JFrame class and implements ActionListener to respond to
button clicks. The interface consists of a display area showing the current expression and result, and a grid of buttons for digits, operations, and functions like square root, 
power, percent, clear (C), and backspace (←). The layout is arranged using BorderLayout and GridBagLayout for flexibility in button positioning. Buttons are custom-drawn using the 
RoundedButton inner class, which enhances the appearance with rounded corners and hover/press effects. Input handling is managed through the actionPerformed method, which updates the 
expression string (currentInput) and evaluates it when the equals ) button is pressed. Expressions are parsed manually, supporting operations like exponentiation (^), square root (√),
and percentage (%). The program uses BigDecimal for accurate mathematical calculations and parses and processes expressions step-by-step by operator precedence. The main method uses SwingUtilities.
invokeLater to launch the application on the event-dispatching thread, ensuring thread safety in the UI.
