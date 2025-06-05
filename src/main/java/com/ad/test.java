package com.ad;
import com.birdbrain.Finch;
public class test {
    public static void main(String[] args){
        Finch bird = new Finch();
        bird.setMove("F", 105, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 40, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 35, 50);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 48, 50);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 115, 50);



        // int[] distances = {105, 50};
        // String[] turns = {"R"};

        // for (int distance : distances) {
        //     bird.setMove("F", distance, 50);
        // }
        bird.stop();
    }
}
