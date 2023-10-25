// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)
        throws IOException
        {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
            String name = reader.readLine();
            System.out.printf("Hello and welcome " + name +"!\n");

            Point p1=new Point(10,30);
            Rectangle recone=new Rectangle(p1, 10, 30);
            int area=recone.getArea();
            System.out.println(area + "\n");

            JButton button= new JButton("Click Me!");


            // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        /*for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
        }
    }
