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
        JButton button3 =new JButton("X");
        button1.addActionListener(this);
        button2.addActionListener(this::secondButton);
        button3.addActionListener(this::end);


        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        button1.setBounds(100,100,100,100);
        button2.setBounds(100, 200, 100, 100);
        button3.setBounds(400, 0, 30, 30);

        button3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        button3.setHorizontalAlignment(SwingConstants.CENTER);
        button3.setBackground(Color.RED);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("ARIAL", Font.PLAIN, 20));
        frame.setLayout(null);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setTitle("Many Buttons");

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

    public void end(ActionEvent ex){
        System.exit(1);
    }

    public static void main(String args[]){

        ClicksCount Clicks = new ClicksCount();

    }
}
