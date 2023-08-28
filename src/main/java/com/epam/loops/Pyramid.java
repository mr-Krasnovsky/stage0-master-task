package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){
            for (int k = cathetusLength; k >= 2; k--){
                if (k > i){
                    System.out.print(" ");
                } else {
                    System.out.print(k);
                }
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
