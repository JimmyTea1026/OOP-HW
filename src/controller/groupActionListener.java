package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.Shape;
import model.node;

public class groupActionListener extends MenuBtnActionListener{

    public groupActionListener(JToggleButton b, ArrayList<Shape> s){
        super(b, s);
    }
    
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        ArrayList<Shape> selectedList = new ArrayList<Shape>();
        for(int i = 0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if(s.selectedStatus()){
                selectedList.add(s);
            }
        }
        if(selectedList.size() > 1){
            ArrayList <node> nodeList = new ArrayList <node>();
            for(int i = 0; i < selectedList.size(); i++){
                node root = selectedList.get(i).getNodePointer().getRoot();
                if(!nodeList.contains(root)){
                    nodeList.add(root);
                }
            }
            nodeList.get(0).group(nodeList);
        }
    } 
}
