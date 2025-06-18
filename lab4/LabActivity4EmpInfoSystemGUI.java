import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI {
    public static void main(String[] args) {
        
Frame frame = new Frame("Employee Information System");
frame.setSize(500, 600);
frame.setLayout(null);
frame.setResizable(false);
frame.setLocationRelativeTo(frame);
// Dito po inaayos ung layout or nag dedesign ng frame
       
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
frame.dispose();
}// mag sasara ang frame pag pinipindot ang close button
});

        
Label firstnameLabel = new Label("First Name:");
firstnameLabel.setBounds(30, 50, 100, 30);
frame.add(firstnameLabel);
// x = 30, y = 50, width = 100, height = 30
        

TextField firstnameField = new TextField();
firstnameField.setBounds(200, 50, 200, 30);
frame.add(firstnameField);

Label lastnameLabel = new Label("Last Name:");
lastnameLabel.setBounds(30, 100, 100, 30);
frame.add(lastnameLabel);

TextField lastnameField = new TextField();
lastnameField.setBounds(200, 100, 200, 30);
frame.add(lastnameField);

Label ageLabel = new Label("Age:");
ageLabel.setBounds(30, 150, 100, 30);
frame.add(ageLabel);

TextField ageField = new TextField();
ageField.setBounds(200, 150, 200, 30);
frame.add(ageField);

Label hoursLabel = new Label("Hours Worked:");
hoursLabel.setBounds(30, 200, 120, 30);
frame.add(hoursLabel);

TextField hoursField = new TextField();
hoursField.setBounds(200, 200, 200, 30);
frame.add(hoursField);

Label rateLabel = new Label("Hourly Rate:");
rateLabel.setBounds(30, 250, 100, 30);
frame.add(rateLabel);

TextField rateField = new TextField();
rateField.setBounds(200, 250, 200, 30);
frame.add(rateField);

Button submitButton = new Button("Submit");
submitButton.setBounds(180, 300, 100, 30);
frame.add(submitButton);

TextArea outputArea = new TextArea();
outputArea.setBounds(30, 350, 430, 200);
outputArea.setEditable(false);
frame.add(outputArea);

       
submitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
    String firstName = firstnameField.getText().trim();
    String lastName = lastnameField.getText().trim();
    String ageText = ageField.getText().trim();
    String hoursText = hoursField.getText().trim();
    String rateText = rateField.getText().trim();
    // dito po kinukuha po yung laman ng text field then ung trim naman sya po yung taga tanggal ng mga extra spacing

                
  if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty()
  || hoursText.isEmpty() || rateText.isEmpty()) {
 outputArea.setText("Error: All fields must be filled.");//lalabas ito kapag may isang question na hindi nasagutan 
 return;// mag sstop po dito yung code pag may nakitang kulang or di nasagutan
}

     try {
    int age = Integer.parseInt(ageText);
    if (age < 0) {
    outputArea.setText("Error: Age must be a positive whole number.");
    return;
}
    } catch (NumberFormatException ex) {// dito po dinedetect kung may naisamang letters or symbol
    outputArea.setText("Error: Age must be a whole number.");// tapos pag may nakita po. Eto ang lalabas
return;// Then mag sstop na yung code pag may nakitang mali kasi kailangan whole number lang
}

double hours, rate;
try {
hours = Double.parseDouble(hoursText);
rate = Double.parseDouble(rateText);
if (hours < 0 || rate < 0) {
outputArea.setText("Error: Hours Worked and Hourly Rate must be a positive number.");
return;
}
    } catch (NumberFormatException ex) {
    outputArea.setText("Error: Hours Worked and Hourly Rate must be numeric.");
return;
}
                
                
    double dailySalary = hours * rate;
    String fullName = firstName + " " + lastName;

    outputArea.setText("Full Name: " + fullName +
    "\nAge: " + ageText +
    "\nDaily Salary: PHP" + String.format("%.2f", dailySalary));
   }
});
    frame.setVisible(true);
    }
} 
