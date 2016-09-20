/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeconverter;

/**
 *
 * @author Carter
 */
public class Gradeconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade = readInt("What is your grade? ");
        if(grade <= 100 && grade >= 90)
        {
            System.out.println("A");
        }
        else if(grade < 90 && grade >= 80)
        {
            System.out.println("B");
        }
        else if(grade < 80 && grade >= 70)
        {
            System.out.println("C");
        }
        else if(grade < 70 && grade >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
    
}
