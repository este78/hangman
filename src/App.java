import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //vars
        String[] words ={"january","february","march","april","may","june","july","august","september","october","november","december"};
        char userChar;
        int lives = 6;
        boolean loseLife = true;
        int randomPick=(int)(Math.random()*words.length);
        String playWord = words[randomPick];
        StringBuffer displayBuff = new StringBuffer();
        String displayGuesses;
        //hides the word in the display
        for(int i=0;i<playWord.length();i++){
            displayBuff.append("*");
        }
        displayGuesses = displayBuff.toString();
       
        //game logic
        //input
        do{
            System.out.println("Hidden: "+displayGuesses);
            userChar = (JOptionPane.showInputDialog(null, "Enter a guess")).charAt(0);
            //compare guess against playword
            for(int i=0;i<playWord.length();i++){
                if(playWord.charAt(i)==userChar){
                    //update buffer with correct chars (need to be a string to update buffer)
                    displayBuff.replace(i,i+1,userChar+"");
                    loseLife =false;
                }
            }
            if(loseLife==true){
                lives--;
            }
            displayGuesses = displayBuff.toString();
            System.out.println(displayGuesses+ " Lives: "+ lives);
            loseLife=true;
        }while(lives>0);
        System.out.println("Game Over");
    }
}
