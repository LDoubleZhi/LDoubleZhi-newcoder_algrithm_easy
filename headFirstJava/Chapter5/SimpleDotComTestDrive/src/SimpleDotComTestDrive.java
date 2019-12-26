import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : liulinzhi
 * @date: 2019/12/26/16:02
 * @description:
 */
class GameHelper{

    String getUserInput(String alert){
        System.out.println(alert);
        String inputLine = null;

        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }catch(IOException e){
            System.out.println("IOEXCEPTION :" + e );
        }
        return inputLine;

    }
}
class SimpleDotCom{
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);// string->int 大的往小的转
        String result = "miss";
        for (int cell : locationCells) {//增强版for，可用于array和sets
            if (cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();


        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took" + numOfGuesses + "guesses");
            }
        }
    }
}
