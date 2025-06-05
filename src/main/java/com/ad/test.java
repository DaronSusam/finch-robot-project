package com.ad;
import com.birdbrain.Finch;
public class test {
    public static void main(String[] args){
        Finch bird = new Finch();

        /*
         * This part of our code will move the robot through the maze.
         *  Measurments done in cm. 
         * Make sure to put robot a little to the left as it often drifts.
         */
        bird.setMove("F", 105, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 40, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 35, 50);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 48, 50);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 115, 50);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 12,50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 24, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 20,50);

/*
 * Plays sound after maze is completed.
 */
        // public int getSound()

        // System.out.println("Sound: " + bird.getSound());




        // int[] distances = {105, 50};
        // String[] turns = {"R"};

        // for (int distance : distances) {
        //     bird.setMove("F", distance, 50);
        // }
        bird.stop();
    }
}
