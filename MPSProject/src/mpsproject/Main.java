/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mpsproject;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class Main
{
    public static void read(String name, int dim) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(name));
        dim =  scanner.nextInt();

        int [][] mat = new int[dim][dim];

        for (int i = 0; i < dim; i++)
           for(int j = 0 ; j < dim; j++)
           {
                if(scanner.hasNextInt())
                {
                   mat[i][j] = scanner.nextInt();
                }
           }
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {



    }

}
