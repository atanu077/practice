
import java.util.Scanner;

public class PhoneNumbers
{
public static void main(String[] args){
   Scanner input;

      Scanner scan = new Scanner(System.in);//get user input

      System.out.print( "Please enter a phone number:");

      String word = scan.nextLine();
   int numOfDigits = word.length();
   boolean hasMoreDigits = false;
   boolean hasLessDigits = false;

   if(numOfDigits > 5){
     for (int i = 0; i < numOfDigits; ++i){
       if (numOfDigits < 10){
         hasLessDigits = true;
       }
       else if (numOfDigits > 10){
         hasMoreDigits = true;
       }

       if (hasLessDigits && hasMoreDigits){
         break; // check finished
       }
     }

     if (hasMoreDigits){
       System.out.println
         ("Your phone number has more than 10 digits!");
     }
     else if (hasLessDigits){
       System.out.println("Your phone number has less than 10 digits!");
     }
     else{
       System.out.println("Your phone number is 10 digits!");

   }
 }
}
public static void reFormat (String word)
{
  word = String.format("({0}) {1}-{2}",
   word.substring(0, 3),
   word.substring(3, 3),
   word.substring(6));

}}