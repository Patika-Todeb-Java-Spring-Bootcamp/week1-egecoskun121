import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Thread2 extends Thread{

    @Override
    public void run() {

        String score = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("scores.txt"));
            score = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The score is : " + score);

    }
}
