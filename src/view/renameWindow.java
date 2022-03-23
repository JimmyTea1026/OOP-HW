package view;

import java.awt.*;
import javax.swing.*;

public class renameWindow {
    private String getMessage;
    public JFrame jFrame;
    public renameWindow(){
        jFrame = new JFrame();
        Container cp = jFrame.getContentPane();
        getMessage = JOptionPane.showInputDialog(cp, "Enter object name");
        jFrame.setVisible(false);
    }
    public String getObjName(){
        return getMessage;
    }
}
