package view;

import javax.swing.*;
import java.util.ArrayList;
import controller.*;
import model.Line;
import model.Shape;
import model.basicObject;
import utility.curState;

import java.awt.*;

public class GUI {
    public JFrame jFrame;
    public JPanel canvas;
    private Container cp;
    public curState appState;
    private ButtonGroup btnGroup = new ButtonGroup();
    private JToggleButton selectBtn;
    public ArrayList <Shape> ShapeList = new ArrayList<Shape>();
    public ArrayList <basicObject> objList = new ArrayList<basicObject>();
    public ArrayList <Line> lineList = new ArrayList<Line>();

    public GUI(curState s) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        appState = s;
        //設定外觀風格
        jFrame = new JFrame("UML editor"); 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        //重新整理jf容器及其內部元件的外觀
        SwingUtilities.updateComponentTreeUI(jFrame);
    }
    
    public void initialGui(){
        jFrame.setLocation(500,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = jFrame.getContentPane();
        cp.setLayout(null);
        cp.setPreferredSize(new Dimension(1024, 680));;
        jFrame.setVisible(true); 
        this.addMenuBtn();
        this.addMenuBar();
        this.addCanvas();
        jFrame.pack();
    }
    
    private void addMenuBar(){
        JMenu editBtn = new JMenu("edit");
        JMenuItem groupBtn = new JMenuItem("group");
        JMenuItem ungroupBtn = new JMenuItem("ungroup");
        JMenuItem renameBtn = new JMenuItem("rename");
        JMenuBar menuBar = new JMenuBar(); 
        groupBtn.addActionListener(new groupActionListener(appState, selectBtn));
        ungroupBtn.addActionListener(new ungroupActionListener(appState, selectBtn));
        renameBtn.addActionListener(new renameActionListener(appState, selectBtn));

        editBtn.add(groupBtn);
        editBtn.add(ungroupBtn);
        editBtn.add(renameBtn);
        menuBar.add(editBtn);

        jFrame.setJMenuBar(menuBar);
    }

    private void addMenuBtn(){
        selectBtn = new JToggleButton("select");
        JToggleButton associationBtn = new JToggleButton("association line");
        JToggleButton generationBtn = new JToggleButton("generation line");
        JToggleButton compositionBtn = new JToggleButton("composition line");
        JToggleButton classBtn = new JToggleButton("class");
        JToggleButton usecaseBtn = new JToggleButton("use case");
        
        selectBtn.setBounds(10, 10, 150, 100);
        associationBtn.setBounds(10, 120, 150, 100);
        generationBtn.setBounds(10, 230, 150, 100);
        compositionBtn.setBounds(10, 340, 150, 100);
        classBtn.setBounds(10, 450, 150, 100);
        usecaseBtn.setBounds(10, 560, 150, 100);

        selectBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        associationBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
        generationBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
        compositionBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        classBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        usecaseBtn.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

        selectBtn.addActionListener(new selectActionListener(appState));
        associationBtn.addActionListener(new assciationActionListener(appState));
        generationBtn.addActionListener(new generationActionListener(appState));
        compositionBtn.addActionListener(new compositionActionListener(appState));
        classBtn.addActionListener(new classActionListener(appState));
        usecaseBtn.addActionListener(new usecaseActionListener(appState));

        btnGroup.add(selectBtn);
        btnGroup.add(associationBtn);
        btnGroup.add(generationBtn);
        btnGroup.add(compositionBtn);
        btnGroup.add(classBtn);
        btnGroup.add(usecaseBtn);

        cp.add(selectBtn);
        cp.add(associationBtn);
        cp.add(generationBtn);
        cp.add(compositionBtn);
        cp.add(classBtn);
        cp.add(usecaseBtn);
    }
    
    private void addCanvas(){
        canvas = new MyCanvas(ShapeList);
        canvas.addMouseListener(new canvasMouseListener(appState, canvas, ShapeList, objList, lineList));
        canvas.setBackground(Color.lightGray);
        canvas.setBounds(180, 10, 830, 650);
        cp.add(canvas);
    }

}