package com.ad;
import com.birdbrain.Finch;
public class test {
    public static void main(String[] args){
        Finch bird = new Finch();
        bird.setMove("F", 46, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 20, 50);

        bird.stop();
    }
}
