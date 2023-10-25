import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ClicksCount implements ActionListener{

    int count = 0;// store number of clicks
    int second =0;

    ClicksCount(){
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        button1.addActionListener(this);
        button2.addActionListener(this::secondButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(button1);
        frame.add(button2);
        frame.getRootPane().setDefaultButton(button1); // sets default button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        System.out.println("You have clicked the ACTIVE button " + count + " times");
    }

    public void secondButton(ActionEvent a){
        second++;
        System.out.println("You've clicked the second button " + second + " times");

    }

    public static void main(String args[]){

        ClicksCount Clicks = new ClicksCount();
    }
}
