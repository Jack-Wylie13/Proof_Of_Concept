import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import javax.swing.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        List<Integer> l = new ArrayList<Integer>();
        File f = new File("results.txt");
        FileWriter file = new FileWriter("results.txt", true);

        JFrame f1 = new JFrame("Proof");
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f1.setSize(500, 500);
        JLabel l1 = new JLabel("Program adds 10 random integers into an Arraylist which then get printed out onto a file called results.txt");
        f1.add(l1);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

        for(int i = 0; i < 10; i++){
            l.add(i, rand.nextInt());
        }
        for(int i = 0; i < l.size(); i++){
            System.out.println("Rand int " + i + ": " + l.get(i));
            file.write(l.get(i) + "\n");
        }



    }
}