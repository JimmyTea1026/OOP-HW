
import javax.swing.*;

import utility.curState;
import view.GUI;


public class App {
    static curState appState = new curState();
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        GUI gui = new GUI(appState);
        gui.initialGui();
    }
}
