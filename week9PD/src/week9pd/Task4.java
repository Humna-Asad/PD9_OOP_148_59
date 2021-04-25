/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9pd;
import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args){
        
        System.out.println("Function1->Email Checker");
        System.out.println("Function2->PhoneNumber Checker");
        System.out.println("Function3->CNIC Checker");
        System.out.println("Function4->conctatenate two strings ");
        System.out.println("Function5-> Check if input is integer or alphabet ");
        System.out.println("Function6-> Replace 0 with *");
        System.out.println("Function7-> Shift all letters of string to uppercase ");
        System.out.println("Enter Fuction Number which you want to check(enter 0 to exit) :");
       
        Scanner sn = new Scanner(System.in);
        int input = sn.nextInt();
        
           if( input == 1){
               System.out.println("Enter Input:");
               Scanner scn = new Scanner(System.in);
               String str = scn.nextLine();
               boolean f1 = isValidEmail(str);
               if( f1 == true)
                {
                  System.out.println("Correct Email..");
                }
               else
                {
           
                  System.out.println("Incorrect Email!!");
                 }
            }
           
            if( input == 2){
                 System.out.println("Enter Input:");
                 Scanner scn = new Scanner(System.in);
                String str = scn.nextLine();
                boolean f2 = validatePhoneNumber(str);
                if( f2 == true)
               {
                 System.out.println("Valid Phone Number..");
               }
               else
               {
                 System.out.println("InValid Phone Number!!"); 
                  }
            }
            
            if( input == 3){
                  System.out.println("Enter Input:");
                 Scanner scn = new Scanner(System.in);
                 String str = scn.nextLine();
                  boolean f3 = validateCNIC(str);
                if( f3 == true)
                 {
                  System.out.println("Valid CNIC Number..");
                 }
                else
                {
                   System.out.println("InValid CNIC Number!!"); 
                  }
            }
            
            if( input == 4){
                     
                  Scanner scn = new Scanner(System.in);
                  System.out.println("Enter First String:");
                   String str1 = scn.nextLine();
                   System.out.println("Enter Second String:");
                   String str2=scn.nextLine();
                   concatenate(str1,str2);
            }
            
            if( input == 5){
                 System.out.println("Enter Input:");
                 Scanner scn = new Scanner(System.in);
                 String str = scn.nextLine();
                 boolean f5=checkInt(str);
                 if(f5==true)
                 {
                  System.out.println("String is integer");
                 }
                 else
                 {
                   System.out.println("String is alphabetic");
                 }
            }
            
            if( input == 6){
                  System.out.println("Enter Input:");
                 Scanner scn = new Scanner(System.in);
                 String str = scn.nextLine();
                 String f6=replace(str);
                 System.out.println("The required output is:"+replace(str));
            }
             if( input == 7){
                System.out.println("Enter Input:");
                Scanner scn = new Scanner(System.in);
                String str = scn.nextLine();
                String f7=toUpper(str);
                System.out.println("The required output is:"+toUpper(str));
            }
            
          
        }
       
   
    
    //Fuunction1
    /**
     * This method is used to check the validation of Email. 
     * @param email
     * @return true/false
     */
    public static boolean isValidEmail(String email) {
      String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
     }
    
    //Function2
    /**
     * This method is used to check the validation of Phone Number.
     * Format 0321-------
     * @param phoneNumber
     * @return true/false
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
    // validate phone numbers of format "1234567890"
      boolean flag = phoneNumber.matches("\\d{11}");
        return flag;
    }
    
    //Function3
    /**
     *  This method is used to check the validation of CNIC Number.
     * @param CNIC
     * @return true/false
     */
     public static boolean validateCNIC(String CNIC) {
    // validate phone numbers of format "1234567890"
      boolean flag = CNIC.matches("\\d{13}");
        return flag;
    }
     public static void concatenate(String str1,String str2)
     {
      String sentence=str1+str2;
      System.out.println(sentence);
     
     }
     public static boolean checkInt(String str)
     {
      boolean flag=false;
      char arr[]=str.toCharArray();
      for(int i=0;i<arr.length;i++)
      {
       if(arr[i]>='0' && arr[i]<='9')
       {
        flag=true;
       }
       else
       {
        flag=false;
       }
      }
      return flag;
     }
     public static String replace(String str)
     {
      String replaced=str.replaceAll("0", "*");
      return replaced;
     
     }
     public static String toUpper(String str)
     {
      String txt=str.toUpperCase();
      return txt;
     }
    
}