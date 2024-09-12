import java.util.Scanner;

import javax.swing.*;
public class Exercises {
    public static void main(String[] args) {

//E1 1.11//
/*boolean isRaining = true;
boolean isCold = false;

if (isCold && isRaining == true) 
System.out.println("Stay inside");
  else
   System.out.println("You can go out");

String result = (isCold && isRaining) ? "Stay inside" : "You can go out";
System.out.println(result); */

//1.12//
/*
String firstName = "Alma";
String lastName = "Bolin";
String fullName = firstName + " " + lastName;
int lengthOfFullName = fullName.length();
System.out.println("Full name is " + fullName + " and length is " + lengthOfFullName);;
*/

//1.13//
/*int x = 15;
int y = 4;
double quotient = x/(double) y;
int remainder = x % y;
System.out.println("quotient: " + quotient + " remainder: " + remainder);
*/

//1.14//
/*
int value = 12;
if (value%2 == 0) {
  System.out.println("Even");
    if (value > 10){
      System.out.println("Greater than 10"); }
    else {
      System.out.println("Not greater than 10"); }
    }
else{
   System.out.println("Odd"); 
   if (value > 10){
    System.out.println("Greater than 10"); }
  else {
    System.out.println("Not greater than 10"); }
  }
    
*/

//1.15//
/* 
String sentence = "Hi I really like dogs";
if (sentence.contains("dogs")) {
int Index = sentence.indexOf("dogs");
System.out.println("The index of the word dogs is " + Index);
}
else {
    System.out.println("The sentence does not contain 'dogs' ");
}

*/
//1.16//
/*
int a = 5, b = 10, c = 15, d = a;
System.out.println("A = " + a + " B = " + b + " C = " + c);
a = b; b = c; c = d;
System.out.println("A = " + a + " B = " + b + " C = " + c);
 */
//1.17//
/*
int n = 15;
int sum = n * (n+1)/2;
System.out.println(sum);
*/

//1.18
/*
String originalString = "Hej jag heter Alma";
int n = originalString.length();
System.out.println("Meningen: " + originalString + " har " + n + " antal bokstäver.");

*/

//---------------------------------------------------------------------------------------------
//E2
//2.4
/*for (int i = 0; i <= 10; i++){
System.out.println(i);
} */
/*
int i = 0;
while (i <=20 ) {
  i++;
  if (i%2 ==0) {
    System.out.println(i);
  }
}
  */
/*
for (int i = 5, j= 1; j<=10; j++) {
 System.out.println(i*j);
}
 */
/*

 int i = 10;
 while (i>0){
  System.out.println(i);
  i--;
 }
*/
/*
for (int i = 0, j = 0; i<20; i++) {
  if (i%2 !=0) {
    j = i+ j;
    System.out.println(j);
  }
*/


//------------------------------------------------------------------------------------------------------
//Challenges E2
//C2.1 A
/*
int i =1;
int j = 1;
int sum = 0;
for (i=1, j=1;i<=10; i++) {
  for (j = 1; j<= 10; j++) {
    sum = i*j;
    System.out.println(sum); 
  }
}
  */

//C2.1 B
/*
int temp =0;
int rows = 5;
for(int i = 1; i<=rows; i++) {
  System.out.println("");
  for(int j =1; j<=i; j++) {
    System.out.print(j);
    temp = j;
  }
  for (int k = temp - 1; k > 0; k--){ 
    System.out.print(k); 
    }
}
    */







}
}
