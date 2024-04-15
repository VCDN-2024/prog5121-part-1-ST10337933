/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package testlogin;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */

public class Testlogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //(geeksforgeeks,2024)

        System.out.print("Enter your username: "); //(geeksforgeeks,2024)
        String username = scanner.nextLine();
        
       //the above code asks the user to enter the username

        System.out.print("Enter your password: "); //(geeksforgeeks,2024)
        String password = scanner.nextLine();
//the above code asks the user to enter a password


        boolean usernameValid = validateUsername(username); //(w3schls.1998)
        
        
        //the above is used to see if the username is valid
        
        
        boolean passwordValid = validatePassword(password); //(w3schls.1998)
//the aboveis used to see if the password is valid


        if (usernameValid) {
            System.out.println("Username is entered correctly."); //(geeksforgeeks,2024)
        } 
        //if statemant 
        else { //else statement
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no then 5 characters in length."); //(geeksforgeeks,2024)
            return;
        }
        //here if the username meets the standards if it is false is shows an error message and the user has to try again 

        if (passwordValid) {
            System.out.println("Password captured successfully."); //(geeksforgeeks,2024)
        } 
        
        
        
        
        else {
            System.out.println("Password is not correctly formatted, please ensure that your password contains atleast 8 characters, a capital number, a number and a special character."); //(geeksforgeeks,2024)
            return;
        }
// the above uses tge same code as above to check it the password meets the standards if not the user recieves an error message stating that the password needsa capital letter,a number, a specail character and less then 8 characters long



        System.out.println("You have successfully registered. Please login."); //(geeksforgeeks,2024)
//if the standards are met the system will tell the user they have registered and a login then then come up




//the below cod ewill then prompt the user to login into the account the their same credentials





        System.out.print("Enter your username: "); //(geeksforgeeks,2024)
        String loginUsername = scanner.nextLine();

        
        
        //the above asks the user to enter their user name 
        
        
        System.out.print("Enter your password: "); //(geeksforgeeks,2024)
        String loginPassword = scanner.nextLine();

        
        //the above does the same thing but asks for the password 
        
        
        
        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Login successful."); //(geeksforgeeks,2024)
        }
        
        //this 2 lines checks if the username entered now matches the username the user entered to log in
          //it also checks if the password entered now matches the password entered previously 
        
        
        //if both are the same the system will then display a message telling the user that the log in is successful
        
        
        
        
        else {
            System.out.println("Invalid username or password.");//(geeksforgeeks,2024)
        }
    }
    
    
//the else satemnet above displays an error message saying that eithe r the username or password is not correct
    
    
    
    static boolean validateUsername(String username) { //(w3schls.1998)
        return username.contains("_") && username.length() <= 5;
        //this above code uses boolean to validate the username, it is used to check us the username contains an undercore and is less then 5 characters
        
    }

      static boolean validatePassword(String password) { //(w3schls.1998)
        if (password.length() < 8) return false;
        
        
        //if the password is greater then 8 characters the password is set to false

        boolean hasUppercase = false;boolean hasNumber = false;boolean hasSpecialChar = false; //(w3schls.1998)
        
        
        //here i use thr boolean to check if the password contains capital letters, numbers,and a special character
        
        //if the password doest not contain the parameteres it is set to false

        for (char c : password.toCharArray()) {
            
            
            if (Character.isUpperCase(c)) hasUppercase = true;if (Character.isDigit(c)) hasNumber = true;if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
            //here if the password contains all the parameteres the password is set to true and the password is correct
            
            
            
            
        }

        return hasUppercase && hasNumber && hasSpecialChar;
        
        // This line checks if the password is valid by returning true if it contains an uppercase letter, a digit, and a special character, and false otherwise
    }


}
    //the above code uses the same thing as below the boolean to see if the password passes the criteria it checks if it has a capital letter, number, special character and is less then 8 characters long
    
    


//reference
//w3schools boolean,1998. accessed 13/04/2024.https://www.w3schools.com/js/js_booleans.asp
//geeksforgeeks, 2024. accesed 13/04/2024.https://www.geeksforgeeks.org/system-out-println-in-java/
