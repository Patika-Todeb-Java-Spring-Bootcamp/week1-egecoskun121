import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producerspring {



    public File writeScoreToFile() throws IOException, InvalidTeamNameException, InvalidScoreException {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int numberCounter = 0;
        int letterCounter = 0;
        for(int i=0;i<text.length();i++){
            if(Character.isLetter(text.charAt(i))){
                letterCounter++;
            }
            if(Character.isDigit(Integer.valueOf(text.charAt(i)))){
                numberCounter++;
            }
        }

        if(letterCounter<5){
            throw new InvalidTeamNameException("You entered invalid team name");
        }

        if(numberCounter<2 || numberCounter>5){
            throw new InvalidScoreException("You entered invalid score");
        }

        BufferedWriter output;
        File file = new File("scores.txt");
        output = new BufferedWriter(new FileWriter(file));
        output.write(text);
        output.close();


        return file;
    }
}





