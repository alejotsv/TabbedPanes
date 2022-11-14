package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JFrame {
    Dimension dim = new Dimension(500, 200);

    TabbedPane(String title){
        super(title);
        setSize(dim);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
