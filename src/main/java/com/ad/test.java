package com.ad;
import com.birdbrain.Finch;
public class test {
    public static void main(String[] args){
        Finch bird = new Finch();

        /*
         * This part of our code will move the robot through the maze.
         *  Measurments done in cm. 
         * Make sure to put robot a little to the left as it often drifts.
         * Added for loop and arrays to simplify the code.
         */
        int[] distances = {105, 40, 35, 48, 115, 12, 24, 20};
        String[] turns = {"L", "L", "R", "R", "R", "L", "L"};
        
        for (int i = 0; i < distance.length; i++) {
            bird.setMove("F", distances[i], 50);
            bird.setTurn(turns[i], 90, 50);
        }



        bird.stop();
    }
}
