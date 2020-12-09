public class App {
    public static void main(String[] args) throws Exception {
        //vars
        String[] words ={"january","february","march","april","may","june","july","august","september","october","november","december"};
        int lives = 6;
        int randomPick=(int)(Math.random()*words.length);
        String playWord = words[randomPick];
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println(playWord);
    }
}
