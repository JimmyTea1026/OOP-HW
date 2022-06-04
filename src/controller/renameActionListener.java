package controller;

import view.renameWindow;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import model.Shape;
import model.basicObject;
import model.node;

public class renameActionListener extends MenuBtnActionListener{
    private JPanel canvas;

    public renameActionListener(JToggleButton b, ArrayList<Shape> s, JPanel c){
        super(b, s);
        canvas = c;
    }
    
    @Override
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
        if(selectedList.size() == 1){
            renameWindow renameWindow = new renameWindow();
            String objname = renameWindow.getObjName();
            if(objname != null){
                selectedList.get(0).rename(objname);
            }
            canvas.repaint();
        }
    } 
}
