package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JFrame {
    Dimension dim = new Dimension(300, 200);

    TabbedPane(String title){
        super(title);
        setSize(dim);
        JTabbedPane mainTabbedPane = new JTabbedPane();
        add(mainTabbedPane);

        JPanel name = createTab("Name: ", "Comments: ");
        JPanel email = createTab("E-mail: ", "Comments: ");
        JPanel favoriteFood = createTab("Favorite food: ", "Alergies: ");

        mainTabbedPane.add("Name", name);
        mainTabbedPane.add("E-mail", email);
        mainTabbedPane.add("Favorite Food", favoriteFood);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel createTab(String label1, String label2){
        JPanel tab = new JPanel();
        JLabel text1 = new JLabel(label1);
        JTextField field = new JTextField(14);
        JLabel text2 = new JLabel(label2);
        JTextArea textArea = new JTextArea(5, 14);
        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        tab.add(text1);
        tab.add(field);
        tab.add(text2);
        tab.add(textArea);
        tab.add(okBtn);
        tab.add(cancelBtn);

        return tab;
    }


}
