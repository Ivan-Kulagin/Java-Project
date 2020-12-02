package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyWrite {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        try(FileWriter writer = new
                FileWriter("src/ru/mirea/lab8/KeyWrite.txt", false))
        {
            writer.write(inp);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
