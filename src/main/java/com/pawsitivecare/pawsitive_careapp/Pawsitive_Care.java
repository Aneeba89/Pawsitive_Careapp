package com.pawsitivecare.pawsitive_careapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pawsitive_Care {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Welcome to PawsitiveCare!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Center the frame

        // Set background image
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\IDEAL\\OneDrive\\Desktop\\img_paws.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setLayout(new BorderLayout());

        // Add title label (Centered at the top)
        JLabel titleLabel = new JLabel("Welcome to PawsitiveCare!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 36));
        titleLabel.setForeground(new Color(191, 128, 64));  // Black color for text
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(255, 255, 255, 150)); // Semi-transparent white background
        titleLabel.setPreferredSize(new Dimension(800, 100));
        backgroundLabel.add(titleLabel, BorderLayout.NORTH);

        // Add description label (Centered below title)
        JLabel descriptionLabel = new JLabel("Your one-stop destination for pet care services.", SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Papyrus", Font.ITALIC, 20));
        descriptionLabel.setForeground(new Color(255, 255, 255, 150));  // Black color for text
        descriptionLabel.setOpaque(true);  // Make the label opaque to show background color
        descriptionLabel.setBackground(new Color(255, 255, 255, 150)); // Semi-transparent white background
        descriptionLabel.setPreferredSize(new Dimension(800, 60));
        backgroundLabel.add(descriptionLabel, BorderLayout.CENTER);

        // Create a panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Make the panel transparent
        buttonPanel.setLayout(new GridBagLayout()); // Use GridBagLayout to center the buttons
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding around the buttons

        // Create buttons for Login and Sign Up
        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Sign Up");

        // Button styling
        Font buttonFont = new Font("Papyrus", Font.PLAIN, 18);
        Color buttonColor = new Color(0, 0, 0); // Black color for buttons
        Color textColor = new Color(255, 255, 255, 150); // White text

        // Set button font and color
        loginButton.setFont(buttonFont);
        signupButton.setFont(buttonFont);
        loginButton.setBackground(buttonColor);
        signupButton.setBackground(buttonColor);
        loginButton.setForeground(textColor);
        signupButton.setForeground(textColor);

        // Add login button to center of panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(loginButton, gbc);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                //setVisible(false);
            }
        });
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signup signup = new Signup();
                signup.setVisible(true);
                //setVisible(false);
            }
        });
        // Add signup button to center of panel, below login button
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(signupButton, gbc);

        // Create another panel for other buttons (Our Services and Contact Us)
        JPanel otherButtonsPanel = new JPanel();
        otherButtonsPanel.setOpaque(false); // Make it transparent
        otherButtonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Center the buttons with space

        // Buttons for "Our Services" and "Contact Us"
        JButton servicesButton = new JButton("Our Services");
        JButton contactButton = new JButton("Contact Us");

        // Set the font and color for the buttons
        servicesButton.setFont(buttonFont);
        contactButton.setFont(buttonFont);
        servicesButton.setBackground(buttonColor);
        contactButton.setBackground(buttonColor);
        servicesButton.setForeground(textColor);
        contactButton.setForeground(textColor);

        // Add buttons to the other panel
        otherButtonsPanel.add(servicesButton);
        otherButtonsPanel.add(contactButton);

        // Add the button panels to the background label
        backgroundLabel.add(buttonPanel, BorderLayout.CENTER);  // Put login and signup in the center
        backgroundLabel.add(otherButtonsPanel, BorderLayout.SOUTH);  // Put other buttons at the bottom

        // Set the content pane of the frame
        frame.setContentPane(backgroundLabel);

        // Set frame visibility
        frame.setVisible(true);

        // Action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Action listener for signup button
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Action listener for services button
        servicesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Our Services button clicked!");
            }
        });

        // Action listener for contact us button
        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Contact Us button clicked!");
            }
        });
    }
}


