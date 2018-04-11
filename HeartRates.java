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
-a method that calculates and returns the person’s age (in years): public int calculateAge(int yearOfBirth)
-a method that calculates and returns the person’s maximum heart rate: public int calculateMaximumHeartRate()
-a method that calculates and returns the person’s target heart rate: public void calculateTargetHeartRate()

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

public class HeartRates {

String firstName;
String lastName;

int dateOfBirth;
int monthOfBirth;
int yearOfBirth;
  //classe construtora
  public HeartRates(String firstName, String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth){}
  
  //métodos Getters e Setters
  public String getfirstName(){return firstName;}
    
  public void setfirstName(){this.firstName = firstName;}
  
  public String getlastName(){return lastName;}
    
  public void setlastName(){this.lastName = lastName;}
  
  public int getdateOfBirth(){return dateOfBirth;}
  
  public void setdateOfBirth(){this.dateOfBirth = dateOfBirth;}
  
  public int getmonthOfBirth(){return monthOfBirth;}
  
  public void setmonthOfBirth(){this.monthOfBirth = monthOfBirth;}
  
  public int getyearOfBirth(){return yearOfBirth;}
  
  public void setyearOfBirth(){this.yearOfBirth = yearOfBirth;}
  
  //Método que recebe o ano do nascimento e calcula a idade
  public int calculateAge(int yearOfBirth){
  //LocalDate birthday = LocalDate.of(yearOfBirth,monthOfBirth,dateOfBirth);
  LocalDate now = LocalDate.now();
  int actualYear = now.getYear();
  int ageInYears = (actualYear - yearOfBirth); 
  return ageInYears;
  
 // O aniversário ocorreu este ano?
 if ( monthOfBirth < now.getMonth() )
  {
    return ageInYears; // O aniversário ocorreu este ano
  }
 if ( monthOfBirth == now.getMonth() && dateOfBirth <= now.getDate())
  {
    return ageInYears; // O aniversário ocorreu este ano
  }
  return --ageInYears; // O aniversário ainda não ocorreu este ano
 }
  
  public int calculateMaximumHeartRate(int ageInYears){
  
  int maxHeartRate = 220 - ageInYears;
  return maxHeartRate;
  }
    
  public void calculateTargetHeartRate(int maxHeartRate){
    System.out.println("O valor mínimo do Heart Rate é: " + (maxHeartRate*(50/100)));
    System.out.println("O valor máximo do Heart Rate é: " + (maxHeartRate*(85/100)));  
  }
    
  
  }
  
  
  
  
  


}
