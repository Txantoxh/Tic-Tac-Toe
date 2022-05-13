import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;

public class tictac  implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_Panel = new JPanel();
    JPanel button_panel = new JPanel();
    Component textfield = new Jlabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    boolean player2_turn;

    // constructor
    tictac(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.red);
        frame.setLayout((LayoutManager) new Borderlayout());
        frame.setVisible(true);
        
        JLabel lb = new JLabel("Test");

        textfield.setBackground(new Color(25,25,25));
        textfield.setBackground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic tac toe");
        textfield.setOpaque(true);

        title_Panel.setLayout((LayoutManager) new Borderlayout());
        title_Panel.setBounds(0,0,800,100);

        title_Panel.add(textfield);
        frame.add(title_Panel);


    }
    public void actionPerformed(ActionEvent event){

    }
    public void firtsturn(){

    }
    public void check(){

    }
    public void xwins(int a, int b, int c){

    }
    public void owins(int a, int b, int c){

    }
    
}
