package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.node;

public class groupActionListener implements ActionListener{
    private JToggleButton selectBtn;
    private ArrayList <node> selectedList;

    public groupActionListener(JToggleButton b, ArrayList<node> select){
        selectBtn = b;
        selectedList = select;
    }
    
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        if(selectedList.size() > 1){
            ArrayList <node> nodeList = new ArrayList <node>();
            for(int i = 0; i < selectedList.size(); i++){
                nodeList.add(selectedList.get(i));
            }
            selectedList.clear();
            selectedList.add(nodeList.get(0).group(nodeList));
        }
    } 
}
