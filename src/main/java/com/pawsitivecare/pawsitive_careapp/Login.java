package com.pawsitivecare.pawsitive_careapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private Image backgroundImage;

    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 800);

        // Load the background image
        Image backgroundImage = new ImageIcon("C:\\Users\\IDEAL\\OneDrive\\Desktop\\img_paws.jpg").getImage();

        // Set up the content pane
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title label
        JLabel lblNewLabel = new JLabel("Login Page");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Papyrus", Font.BOLD, 44));
        lblNewLabel.setForeground(new Color(191, 128, 64)); // Adjusted text color
        lblNewLabel.setBounds(-10, 50, 900, 80);  // Centered at the top
        contentPane.add(lblNewLabel);

        // Username label
        JLabel lblNewLabel_1 = new JLabel("Username*");
        lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 14));
        lblNewLabel_1.setForeground(new Color(191, 128, 64)); // Adjusted text color
        lblNewLabel_1.setBounds(300, 250, 100, 19);  // Centered in the left section
        contentPane.add(lblNewLabel_1);

        // Username text field
        textField = new JTextField();
        textField.setBounds(300, 280, 300, 30);  // Centered in the left section
        contentPane.add(textField);
        textField.setColumns(10);

        // Password label
        JLabel lblNewLabel_2 = new JLabel("Password*");
        lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 14));
        lblNewLabel_2.setForeground(new Color(191, 128, 64)); // Adjusted text color
        lblNewLabel_2.setBounds(300, 320, 100, 19);  // Centered in the left section
        contentPane.add(lblNewLabel_2);

        // Password field
        passwordField = new JPasswordField();
        passwordField.setBounds(300, 350, 300, 30);  // Centered in the left section
        contentPane.add(passwordField);

        // Login button
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Papyrus", Font.PLAIN, 14));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(0, 100, 200));
        btnNewButton.setBounds(300, 400, 100, 30);  // Positioned below the password field
        btnNewButton.setFocusable(false);

        contentPane.add(btnNewButton);

        // Reset button
        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.setFont(new Font("Papyrus", Font.PLAIN, 14));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(new Color(220, 20, 60));
        btnNewButton_1.setBounds(500, 400, 100, 30);  // Positioned next to the login button
        btnNewButton_1.setFocusable(false);
        contentPane.add(btnNewButton_1);

        // Reset button action listener
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
                passwordField.setText(null);
            }
        });

        // Back button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Papyrus", Font.PLAIN, 14));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(0,0,0));
        backButton.setBounds(400, 600, 100, 30);  // Positioned below the login button
        contentPane.add(backButton);

        // Back button action listener
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                // Open the previous frame (e.g., Welcome Page)
                Pawsitive_Care welcomePage = new Pawsitive_Care(); // Create an instance of Pawsitive_Care
                welcomePage.display(); // Custom method to make the welcome page visible

            }
        });
    }
}
