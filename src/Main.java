// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        throws IOException
        {
            boolean readname=false;
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            if(readname) {
                BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
                String name = reader.readLine();
                System.out.printf("Hello and welcome " + name + "!\n");
            }
            boolean shape=false;
            if(shape) {
                Point p1 = new Point(10, 30);
                Rectangle recone = new Rectangle(p1, 10, 30);
                int area = recone.getArea();
                System.out.println(area + "\n");
            }

            boolean clicks=false;
            if(clicks) {
                new ClicksCount();
            }

            Scanner sc=new Scanner(new File("credit_card_fraud.csv"));

            sc.useDelimiter(",");

            sc.nextLine();
            while(sc.hasNext()){
                sc.next();
                System.out.print("Transaction Amount: "+sc.next()+ ", ");
                sc.next();
                sc.next();
                sc.next();
                sc.next();
                sc.next();
                sc.next();
                System.out.println("Card Type: " +sc.next());
                sc.nextLine();


            }
            sc.close();

        }
    }
