package hikoyat;

import java.util.Locale;

/*
Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */
public class Cydeo {
    public static void main(String[] args) {
       String firstName = "cyDEo";
       String lastName = "SCHOOL";

       firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
       lastName = lastName.substring(0, 1).toUpperCase()+ lastName.substring(1).toLowerCase();


        System.out.println(firstName + " " + lastName);

    }
}
