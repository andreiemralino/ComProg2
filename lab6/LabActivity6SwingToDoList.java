import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class LabActivity6SwingToDoList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LabActivity6SwingToDoList::new);
    }
}

class LabActivity6SwingToDoList extends JFrame {
    DefaultTableModel tableModel;
    static ToDoForm formWindow = null;

    public LabActivity6SwingToDoList() {
        setTitle("To-Do List Viewer");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dito po yung mismong table
        tableModel = new DefaultTableModel(new Object[]{"Task Name", "Task Description", "Status"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        // dito po if ever na maraming task ang nilagay mag kakaron po sya ng scroll panel

        // buttons
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.addActionListener(e -> {
            if (formWindow == null || !formWindow.isDisplayable()) {
                formWindow = new ToDoForm(this);
            } else {
                formWindow.toFront();
            }
        });

        // ang purpose po nito ay para maicenter po yung mga laman
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(addTaskButton);

    
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    // eto po yung method para mag dagdag ng bagong row pag nag save task ang users
    public void addTask(String name, String desc, String status) {
        tableModel.addRow(new Object[]{name, desc, status});
    }
}

// window sa pag aadd ng new task
class LabActivity6SwingToDoList extends JFrame {
    public ToDoForm(ToDoListViewer viewer) {
        setTitle("Add New Task");
        setSize(400, 250);
        setLocationRelativeTo(viewer);
        setLayout(new BorderLayout());

        
        JTextField nameField = new JTextField();
        JTextArea descArea = new JTextArea(3, 20);
        JComboBox<String> statusBox = new JComboBox<>(new String[]{
            "Not Started", "Ongoing", "Completed"
        });

        //layouts
        JPanel formPanel = new JPanel(new GridLayout(6, 1, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        formPanel.add(new JLabel("Task Name:"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Task Description:"));
        formPanel.add(new JScrollPane(descArea));

        formPanel.add(new JLabel("Status:"));
        formPanel.add(statusBox);

        // saave button
        JButton saveButton = new JButton("Save Task");
        saveButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String desc = descArea.getText().trim();
            String status = (String) statusBox.getSelectedItem();

            // eto po yung lalabas pag pinindot ang save button ng hindi nag fifill in
            if (name.isEmpty() || status == null || status.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please fill in Task Name and Status.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                viewer.addTask(name, desc, status);
                dispose();
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(saveButton);
        
        add(formPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
