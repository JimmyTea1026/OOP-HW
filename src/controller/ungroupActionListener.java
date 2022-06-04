package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.Shape;
import model.node;

public class ungroupActionListener extends MenuBtnActionListener{

    public ungroupActionListener(JToggleButton b, ArrayList<Shape> s){
        super(b, s);
    }
    
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        ArrayList<node> selectedRoot = new ArrayList<node>();
        for(int i = 0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if(s.selectedStatus()){
                if(!selectedRoot.contains(s.getNodePointer().getRoot())){
                    selectedRoot.add(s.getNodePointer().getRoot());
                }
            }
        }
        if(selectedRoot.size() == 1){
            node root = selectedRoot.get(0);
            root.ungroup();
        }
    } 
}
