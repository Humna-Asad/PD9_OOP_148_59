/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9pd;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args){
        System.out.println("Input String :");
        Scanner scn = new Scanner(System.in);
        String strg = scn.nextLine();
        String a = ridMultipleBlank(strg);
        System.out.println("Blank Spaces Removed : "+a);
        String b = removeInteger(strg);
        System.out.println("Integers Removed : "+b);
        String c = stringEncryption(strg);
        System.out.println("Encrypted String : "+c);
    }
    
    
    public static String ridMultipleBlank(String s){
       
        s = s.replaceAll("\\s+", "");
        return s;    
    }
    
    public static String removeInteger(String s){ 

        String removed = ""; 

        for (int i = 0; i < s.length(); i++)
        { 
           if (!Character.isDigit(s.charAt(i))) { 
               
                removed = removed + s.charAt(i); 

            } 

        } 

        return removed; 
    }
    
    public static String stringEncryption(String s) {
     StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
    char c=s.charAt(i); 
     if(i%2==0){
       if(c==122)
            c = (char) (c-25);
     else{
       c=(char) (c+1);}
      sb.append(c);}
   else
   sb.append(c);}
   return sb.toString();
}
}

