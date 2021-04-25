/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9pd;
import java.util.Scanner;


public class Task1 {

     public static void main(String[] args) {
        System.out.println("Enter String :");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int a = wordCounter(str);
        System.out.println("Number of Words :"+a);
        
        int b = vowelCounter(str);
        System.out.println("Number of Vowels: "+b);
        
        int c = puncCount(str);
         System.out.println("Number of Punctuation :"+c);
     }
     
     public static int wordCounter(String s){
        int count = 0;
        char []ch = s.toCharArray();
        for(int i=0; i < ch.length; i++){
        if((ch[i] >= 'a' && ch[i] <= 'z')||( ch[i] >= 'A' && ch[i] <= 'Z') ||( ch[i] == ' ')){
            count++;
        }
        }
        return count;
        
    }
     
    public static int vowelCounter(String s){
        int count = 0;
        char []ch = s.toCharArray();
        for(char c : ch){
            switch(c){
                case'a':
                case'A':
                case'e':
                case'E':
                case'i':
                case'I':
                case'o':
                case'O':
                case'u':
                case'U':
                count++;
                  break;
              
          }
        }
        
        return count;
        
    }
    public static int puncCount(String s){
        int count = 0;
        char []ch = s.toCharArray();
        for(int i=0; i < ch.length; i++){
        if((ch[i] == '.') || (ch[i] == ',') || (ch[i] == ';') || (ch[i] == ':') 
           || (ch[i] == '!') || (ch[i] == '&') || (ch[i] == '-') || (ch[i] == '"')
           || (ch[i] == '?')){
            count++;
        }
        }
        return count;
        
    }
}
