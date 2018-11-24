package Controller;

import java.util.Random;

public class NumbersController {
    public String message;
    public Voice voice;
    public ParseMessage parseMessage;
    public int correctAnswear;
    public int max = 9;
    public int min = 0;

    public NumbersController(String message){
        this.message = message;
    }

    public int generatorOneNumber(){
        int generatedNumber=11;
        Random r = new Random();
        generatedNumber = r.nextInt((max - min) + 1) + min;
        return generatedNumber;
    };

     public boolean iscorrect(){
        return false;
    };

}
