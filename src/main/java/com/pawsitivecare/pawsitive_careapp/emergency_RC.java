package com.pawsitivecare.pawsitive_careapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class emergency_RC extends JFrame {

    private JComboBox<String> cityComboBox;
    private JTextArea contactDetailsTextArea;

    public emergency_RC() {
        setTitle("Emergency Rescue Contacts");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new BorderLayout());

        // City list (add as many cities as you want)
        String[] cities = {"Islamabad", "Karachi", "Lahore", "Rawalpindi", "Peshawar"};

        // Emergency contacts for each city
        HashMap<String, String> emergencyContacts = new HashMap<>();
        emergencyContacts.put("Islamabad", "Rescue Center: 051-111-12345\nAnimal Shelter: 051-1234567");
        emergencyContacts.put("Karachi", "Rescue Center: 021-1234567\nAnimal Shelter: 021-7654321");
        emergencyContacts.put("Lahore", "Rescue Center: 042-2345678\nAnimal Shelter: 042-8765432");
        emergencyContacts.put("Rawalpindi", "Rescue Center: 051-2345678\nAnimal Shelter: 051-1237890");
        emergencyContacts.put("Peshawar", "Rescue Center: 091-1234567\nAnimal Shelter: 091-9876543");

        // Title label
        JLabel titleLabel = new JLabel("Select Your City for Emergency Rescue Contacts", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 20));
        titleLabel.setForeground(new Color(191, 128, 64));  // Adjust color
        titleLabel.setPreferredSize(new Dimension(800, 50));
        add(titleLabel, BorderLayout.NORTH);

        // JComboBox for city selection
        cityComboBox = new JComboBox<>(cities);
        cityComboBox.setFont(new Font("Papyrus", Font.PLAIN, 16));
        cityComboBox.setBackground(new Color(255, 255, 255));
        cityComboBox.setForeground(new Color(0, 0, 0));

        // Action listener for city selection
        cityComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity = (String) cityComboBox.getSelectedItem();
                String contactDetails = emergencyContacts.get(selectedCity);
                contactDetailsTextArea.setText(contactDetails);
            }
        });

        // Panel for city selection
        JPanel cityPanel = new JPanel();
        cityPanel.add(cityComboBox);
        add(cityPanel, BorderLayout.CENTER);

        // Text area to show emergency contact details
        contactDetailsTextArea = new JTextArea(6, 40);
        contactDetailsTextArea.setEditable(false);
        contactDetailsTextArea.setFont(new Font("Papyrus", Font.PLAIN, 16));
        contactDetailsTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(new JScrollPane(contactDetailsTextArea), BorderLayout.SOUTH);

        // Display initial contact details for the default city
        String defaultCity = (String) cityComboBox.getSelectedItem();
        contactDetailsTextArea.setText(emergencyContacts.get(defaultCity));

        setVisible(true);
    }

    public static void main(String[] args) {
        new emergency_RC();
    }
}

