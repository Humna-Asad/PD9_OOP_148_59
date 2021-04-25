/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9pd;

/**
 *
 * @author Noor ul Huda
 */
import java.util.Scanner;
public class Task2 {
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
      System.out.println("Please Enter a sentence: ");
        String sentence=obj.nextLine();
      System.out.println("Your sentence printed vertically is:");
      displayVertical(sentence);
      
    }
  
    public static void displayVertical(String s)
    {
      //char ch[]=s.toCharArray();
      s=s.replaceAll(" ", "");
      for(int i=0;i<s.length();i++)
      {
        System.out.println(s.charAt(i));
          
      }
    }
}