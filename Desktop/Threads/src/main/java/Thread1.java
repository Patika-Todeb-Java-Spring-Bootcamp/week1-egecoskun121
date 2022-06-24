import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Thread1 extends Thread{



    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score in the given format");
        System.out.println("TeamName1 score1-score2 TeamName2");
        String text = scanner.nextLine();

        File file = null;
        try {
            BufferedWriter output;
            file = new File("scores.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
