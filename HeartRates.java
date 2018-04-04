/** HeartRates.java
The formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Example: (220-31) = 189 (100 %)
Your target heart rate is a range that’s 50–85% of your maximum heart rate. 
In case of our example: 50% (94,5) ~ 85% (160,65)

Instance variables:
First name, last name and date of birth (consisting of separate attributes for the month, day and year of birth).

Your class should have a constructor that receives this data as parameters.
For each attribute provide set and get methods.
The class also should includes:
-a method that calculates and returns the person’s age (in years): public int calculateAge(int dateOBirth,int monthOfBirth,int yearOfBirth)
-a method that calculates and returns the person’s maximum heart rate: public int calculateMaximumHeartRate()
-a method that calculates and returns the person’s target heart rate: public int calculateTargetHeartRate()

Write a Java app that prompts for the person’s information.
Instantiates an object of class HeartRates and prints the information from that object—including the person’s:
-first name
-last name
-date of birth

then calculates and prints:
-the person’s age in (years)
-maximum heart rate
-target-heart-rate
range.

*/

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class HeartRates {

String firstName;
String lastName;

int dateOfBirth;
int monthOfBirth;
int yearOfBirth;
  //classe construtora
  public HeartRates(String firstName, String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth){}
  
  //métodos Getters e Setters
  public String getfirstName(){
    return firstName;
  }
    
  public void setfirstName(){
    this.firstName = firstName;
  }
  
  public String getlastName(){
    return lastName;
  }
    
  public void setlastName(){
    this.lastName = lastName;
  }
  
  public int getdateOfBirth(){
    return dateOfBirth;
  }
  
  public void setdateOfBirth(){
    this.dateOfBirth = dateOfBirth;
  }
  
  public int getmonthOfBirth(){
    return monthOfBirth;
  }
  
  public void setmonthOfBirth(){
    this.monthOfBirth = monthOfBirth;
  }
  
  public int getyearOfBirth(){
    return yearOfBirth;
  }
  
  public void setyearOfBirth(){
    this.yearOfBirth = yearOfBirth;
  }
  
  //Método que calcula a idade
  public int calculateAge(int dateOBirth,int monthOfBirth,int yearOfBirth){
  
  LocalDate birthday = LocalDate.of(yearOfBirth,monthOfBirth,dateOfBirth);
  LocalDate now = LocalDate.of(now.getYear, Month.OCTOBER, 11);
  
  }
  
  
  
  
  


}
