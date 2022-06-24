import java.io.File;
import java.io.IOException;

public class Main {




    public static void main(String[] args) {

        Consumerspring consumerspring = new Consumerspring();
        Producerspring producerspring = new Producerspring();

        System.out.println("Enter the score in the given format");
        System.out.println("TeamName1 score1-score2 TeamName2");
        try{
           File file = producerspring.writeScoreToFile();
           String score=consumerspring.readFromFile();
           System.out.println(score);
        }catch(IOException e){
            e.getMessage();
        }catch(InvalidTeamNameException e){
            e.getMessage();
        }catch(InvalidScoreException e){
            e.getMessage();
        }











    }
}
