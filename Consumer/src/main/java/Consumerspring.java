import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Consumerspring {

    public String readFromFile() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("scores.txt"));
        String score=bufferedReader.readLine();
        return "The score is : "+score;

    }

}
