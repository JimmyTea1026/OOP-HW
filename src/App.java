
import javax.swing.*;
import view.GUI;
public class App {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        GUI gui = new GUI();
        gui.initialGui();
    }
}

// 期末TO-DO:
// 1. 把按鈕的actionlistener包裝成一個
// 2. 把Magic number們包裝好
