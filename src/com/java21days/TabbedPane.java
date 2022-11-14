package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JFrame {
    Dimension dim = new Dimension(500, 200);

    TabbedPane(String title){
        super(title);
        setSize(dim);
        JTabbedPane mainTabbedPane = new JTabbedPane();
        add(mainTabbedPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel addTab(String label1, String label2, String button){
        JPanel tab = new JPanel();

        return tab;
    }


}
