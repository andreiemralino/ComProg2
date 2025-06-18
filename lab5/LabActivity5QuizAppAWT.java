import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT extends Frame implements ActionListener {

    
    Label questionLabel;
    CheckboxGroup choicesGroup;
    Checkbox choice1, choice2, choice3, choice4;
    Button nextButton;

    // mga tanong
    String[] questions = {
        "1. What does \"CPU\" stand for?",
        "2.  What is RAM used for?",
        "3. What does URL mean?"
    };
    // mga sagot
    String[][] options = {
        {"Central Peripheral Unit", "Central Processing Unit", "Computer Primary Unit", "Control Processing Utility"},
        {"Storing websites", "Powering the monitor", "Temporary memory", "Display images"},
        {"User Resource Locator", "Unified Routing Line", "Uniform Resource Locator", "Universal Register Link"}
    };

    int[] answers = {1, 2, 2}; // dito po makikita yung mga correct answers
    int currentQuestion = 0;
    int score = 0;


    public LabActivity5QuizAppAWT() {
        // dito po yung mismong out na pag sasagutan ng users
        setTitle("Quiz App");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setResizable(false);

        // Kapag pinindot ang x button sa window, mawawala ang window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        
        Panel questionPanel = new Panel();
        questionLabel = new Label(questions[currentQuestion]);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionPanel.add(questionLabel);
        add(questionPanel, BorderLayout.NORTH);

        
        Panel choicesPanel = new Panel();
        choicesPanel.setLayout(new GridLayout(2, 2, 10, 10)); // dito po para maging 2 rows at 2 columns ang choices ko.

        choicesGroup = new CheckboxGroup();

        choice1 = new Checkbox("", choicesGroup, false);
        choice2 = new Checkbox("", choicesGroup, false);
        choice3 = new Checkbox("", choicesGroup, false);
        choice4 = new Checkbox("", choicesGroup, false);

        customizeCheckbox(choice1);
        customizeCheckbox(choice2);
        customizeCheckbox(choice3);
        customizeCheckbox(choice4);

        choicesPanel.add(choice1);
        choicesPanel.add(choice2);
        choicesPanel.add(choice3);
        choicesPanel.add(choice4);
        add(choicesPanel, BorderLayout.CENTER);

        
        Panel buttonPanel = new Panel();
        nextButton = new Button("Next");
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        loadQuestion();
        setVisible(true);
    }

    public void customizeCheckbox(Checkbox cb) {
        cb.setFont(new Font("Dialog", Font.PLAIN, 14));
        cb.setForeground(Color.DARK_GRAY);
    }

    public void loadQuestion() {
        questionLabel.setText(questions[currentQuestion]);
        choice1.setLabel(options[currentQuestion][0]);
        choice2.setLabel(options[currentQuestion][1]);
        choice3.setLabel(options[currentQuestion][2]);
        choice4.setLabel(options[currentQuestion][3]);

        choicesGroup.setSelectedCheckbox(null); 
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = choicesGroup.getSelectedCheckbox();
        // dito naman po ay pag nag next ang users na walang pinipiling sasagot ay hindi po mag poproceed yung question
        if (selected == null) {
            Dialog dialog = new Dialog(this, "Warning", true);
            dialog.setLayout(new FlowLayout());
            dialog.setSize(300, 100);
            dialog.setLocation(getX() + 100, getY() + 100); 

            Label message = new Label("Please select an answer."); // eto po yung lalabas sa window kapag nag next ng walang sagot
            Button okButton = new Button("OK");

            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                    dialog.dispose();
                }
            });

            dialog.add(message);
            dialog.add(okButton);
            dialog.setVisible(true);
            return;
        }
        // sa part po na to dito po hinahanap kung tama ba yung sagot
        int selectedIndex = -1;
        Checkbox[] choices = {choice1, choice2, choice3, choice4};
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == selected) {
                selectedIndex = i;
                break;
            }
        }

        if (selectedIndex == answers[currentQuestion]) {
            score++; // dito po pag ka tama yung sagot is mag dadagdag yung score
        }

        currentQuestion++;// lipat sa next question

        if (currentQuestion < questions.length) {
            loadQuestion();
        } else {
            
            questionLabel.setText("You got " + score + " out of " + questions.length + " correct!");
            choice1.setEnabled(false);
            choice2.setEnabled(false);
            choice3.setEnabled(false);
            choice4.setEnabled(false);
            nextButton.setEnabled(false);// dito po nidisable na yung mga choices pati na rin ung next button
        }
    }

    public static void main(String[] args) {
        new LabActivity5QuizAppAWT();
    }
}
