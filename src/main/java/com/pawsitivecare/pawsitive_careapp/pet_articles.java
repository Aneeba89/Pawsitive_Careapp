package com.pawsitivecare.pawsitive_careapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class pet_articles extends JFrame {

    public pet_articles() {
        setTitle("Pet Care Articles");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Main layout
        setLayout(new BorderLayout());

        // Title label
        JLabel titleLabel = new JLabel("Pet Care Articles", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        titleLabel.setForeground(new Color(0, 100, 200));
        add(titleLabel, BorderLayout.NORTH);

        // Main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(0, 2, 20, 20)); // 2 columns, dynamic rows
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add categories with articles
        addCategory(contentPanel, "Dogs", new String[]{
                "Dog Training Basics",
                "Understanding Dog Behavior",
                "Best Diets for Dogs",
                "Common Health Issues in Dogs",
                "Grooming Tips for Dogs"
        });

        addCategory(contentPanel, "Cats", new String[]{
                "Caring for Your Cat's Coat",
                "Why Do Cats Purr?",
                "Feeding Your Cat the Right Way",
                "Dealing with Cat Anxiety",
                "Indoor vs Outdoor Cats"
        });

        addCategory(contentPanel, "Birds", new String[]{
                "How to Train Your Parrot",
                "Common Bird Illnesses",
                "Choosing the Right Bird Cage",
                "What to Feed Your Bird",
                "Keeping Your Bird Happy"
        });

        addCategory(contentPanel, "Fish", new String[]{
                "Setting Up Your Aquarium",
                "Caring for Goldfish",
                "Maintaining Water Quality",
                "Feeding Your Fish",
                "Aquarium Decoration Ideas"
        });

        addCategory(contentPanel, "Rabbits", new String[]{
                "Creating a Rabbit-Friendly Home",
                "Rabbit Diet Essentials",
                "How to Handle Your Rabbit",
                "Common Rabbit Diseases",
                "Bonding with Your Rabbit"
        });

        // Add content panel to scrollable pane
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.CENTER);

        // Back button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Papyrus", Font.PLAIN, 18));
        backButton.setBackground(new Color(0, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> dispose()); // Close the articles page
        add(backButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addCategory(JPanel panel, String categoryName, String[] articles) {
        // Create a panel for each category
        JPanel categoryPanel = new JPanel(new BorderLayout());
        categoryPanel.setBorder(BorderFactory.createTitledBorder(categoryName));

        // Add articles as clickable links
        JPanel linksPanel = new JPanel();
        linksPanel.setLayout(new BoxLayout(linksPanel, BoxLayout.Y_AXIS));

        for (String article : articles) {
            JButton articleButton = new JButton(article);
            articleButton.setFont(new Font("Arial", Font.PLAIN, 14));
            articleButton.setHorizontalAlignment(SwingConstants.LEFT);
            articleButton.setBorderPainted(false);
            articleButton.setBackground(Color.WHITE);
            articleButton.setForeground(new Color(0, 102, 204));
            articleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Add action listener to open article window
            articleButton.addActionListener(e -> openArticle(categoryName, article));

            linksPanel.add(articleButton);
        }

        categoryPanel.add(linksPanel, BorderLayout.CENTER);
        panel.add(categoryPanel);
    }

    private void openArticle(String category, String articleTitle) {
        // Create a separate window to display article content
        JFrame articleFrame = new JFrame(articleTitle);
        articleFrame.setSize(600, 400);
        articleFrame.setLocationRelativeTo(null);
        articleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea articleContent = new JTextArea(
                "Category: " + category + "\n\n" +
                        "Article Title: " + articleTitle + "\n\n" +
                        "Content for this article will go here. You can add detailed information about the article in this window."
        );
        articleContent.setFont(new Font("Arial", Font.PLAIN, 16));
        articleContent.setLineWrap(true);
        articleContent.setWrapStyleWord(true);
        articleContent.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(articleContent);
        articleFrame.add(scrollPane);
        articleFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(pet_articles::new);
    }
}
