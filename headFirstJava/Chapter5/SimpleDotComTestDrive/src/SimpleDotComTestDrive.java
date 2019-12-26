import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    private ArrayList<String> locationCells;
//    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
//        int guess = Integer.parseInt(stringGuess);// string->int 大的往小的转
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0){
            locationCells.remove(index);

        if (locationCells.isEmpty()){
            result = "kill";
        }
        else{
            result = "hit";
        }}
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
        System.out.println("randomNum: " + randomNum);

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));
        locations.add(Integer.toString(randomNum+2));

        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numOfGuesses++;//出现bug
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took" + numOfGuesses + "guesses");
            }
        }
    }
}
