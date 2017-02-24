package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static char[][] maze = new char[12][12];
    private static int playerx;
    private static int playery;

    public static void main(String[] args) throws FileNotFoundException{
        createMaze();
        printMaze();
    }

    public static void createMaze() throws FileNotFoundException{
        File input = new File("maze1.txt");
        Scanner inputReader = new Scanner(input);
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                String temp = inputReader.next();
                char inputChar = temp.charAt(0);
                maze[i][j] = inputChar;
            }
        }
    }

    public static void printMaze() {
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
