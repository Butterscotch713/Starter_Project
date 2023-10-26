import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

class ClicksCount implements ActionListener{

    int count = 0;// store number of clicks
    int second =1;

    ClicksCount(){
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Add 1");
        JButton button2 = new JButton("Multiply");
        JButton button3 =new JButton("X");
        JButton piazza = new JButton("Piazza");
        button1.addActionListener(this);
        button2.addActionListener(this::secondButton);
        button3.addActionListener(this::end);
        piazza.addActionListener(this::openPiazza);


        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        button1.setBounds(100,100,100,100);
        button2.setBounds(100, 200, 100, 100);
        button3.setBounds(400, 0, 30, 30);
        piazza.setBounds(100, 300, 100, 100);
        piazza.setForeground(Color.BLUE);
        piazza.setBackground(Color.LIGHT_GRAY);
        button3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        button3.setHorizontalAlignment(SwingConstants.CENTER);
        button3.setBackground(Color.RED);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("ARIAL", Font.PLAIN, 20));
        frame.setLayout(null);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(piazza);
        frame.setTitle("Multiple Options");

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

    public void openPiazza(ActionEvent p){
        try {
            Desktop.getDesktop().browse(new URL("https://piazza.com/class/lle9d0gtsw016b").toURI());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void secondButton(ActionEvent a){
        second=second*(second+1); //integer overflow :)
        System.out.println("You've clicked the second button " + second + " times");

    }

    public void end(ActionEvent ex){
        System.exit(1);
    }

    public static void main(String args[]){

        ClicksCount Clicks = new ClicksCount();

    }
}
