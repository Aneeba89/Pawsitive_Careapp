package com.pawsitivecare.pawsitive_careapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class emergency_RC extends JFrame
{

    private JComboBox<String> cityComboBox;

    public emergency_RC() {
        setTitle("Emergency Rescue Contacts");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new BorderLayout());

        // City list (add as many cities as you want)
        String[] cities = {"Islamabad", "Karachi", "Lahore", "Rawalpindi", "Peshawar", "Multan", "Faisalabad", "Quetta", "Sialkot", "Gujranwala"};

        // Title label
        JLabel titleLabel = new JLabel("Select Your City for Emergency Rescue Contacts", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 20));
        titleLabel.setForeground(new Color(191, 128, 64));  // Adjust color
        titleLabel.setPreferredSize(new Dimension(800, 50));

        // Panel for title
        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false); // Make panel transparent
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // JComboBox for city selection
        cityComboBox = new JComboBox<>(cities);
        cityComboBox.setFont(new Font("Papyrus", Font.PLAIN, 16));
        cityComboBox.setBackground(new Color(255, 255, 255));
        cityComboBox.setForeground(new Color(0, 0, 0));

        // Panel for city selection
        JPanel cityPanel = new JPanel();
        cityPanel.setOpaque(false); // Make panel transparent
        cityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Center the dropdown list
        cityPanel.add(cityComboBox);
        add(cityPanel, BorderLayout.CENTER);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Papyrus", Font.PLAIN, 22));
        submitButton.setBackground(new Color(191, 128, 64));
        submitButton.setForeground(Color.WHITE);
        submitButton.setPreferredSize(new Dimension(200, 60));  // Increased size

        // Back button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Papyrus", Font.PLAIN, 22));
        backButton.setBackground(new Color(191, 128, 64));
        backButton.setForeground(Color.WHITE);
        backButton.setPreferredSize(new Dimension(200, 60));  // Increased size

        // Panel for the Submit and Back buttons (aligned vertically)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Make the panel transparent
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)); // Align buttons vertically
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // Align the panel itself in the center

        buttonPanel.add(submitButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(140, 20))); // Space between the buttons
        buttonPanel.add(backButton);

        // Panel for centering the button panel vertically and horizontally
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setOpaque(false);
        centerPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add the center panel to the window
        add(centerPanel, BorderLayout.SOUTH);

        // Action listener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity = (String) cityComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(emergency_RC.this,
                        "You selected: " + selectedCity,
                        "City Selection",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Action listener for Back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current window or navigate to a previous screen
                // Here, we close the window for now
                emergency_RC.this.dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new emergency_RC();
    }
}
