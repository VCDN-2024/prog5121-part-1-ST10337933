/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testlogin;
/**
 *
 * @author lab_services_student
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestloginTest {

    @Test
    public void testValidateUsername_Valid()
    {
        assertTrue(Testlogin.validateUsername("user_"));
    }
    //if the useranme conatians all small letters and is less the 5 characters and contains a underscaore then the username is correct
    
    
    

    @Test
    public void testValidateUsername_Invalid_Length() 
    {
        assertFalse(Testlogin.validateUsername("user"));
    }
//if the username is 4 characters it is invalid 
    
    
    
    
    @Test
    public void testValidateUsername_Invalid_NoUnderscore() 
    {
        assertFalse(Testlogin.validateUsername("username"));
    }
    
    
    //if the username is larger then 5 characters but no underscore it is also invalid

    @Test
    public void testValidatePassword_Valid() 
    {
        assertTrue(Testlogin.validatePassword("Password1!"));
    }
    
    //the above is showing what id the correct password for the account

    @Test
    public void testValidatePassword_Invalid_Length() 
    
    {
        assertFalse(Testlogin.validatePassword("Arv!"));
    }
    
    
    //the above for cantains capital,numbers,and special characaters but is too short therefore the password would be invalid
    

    @Test
    public void testValidatePassword_Invalid_NoUppercase() 
    {
        assertFalse(Testlogin.validatePassword("araavdh1"));
    }
    
    //here if the password entered has no capital letter the password will be invalid again
    

    @Test
    
    public void testValidatePassword_Invalid_NoNumber() 
    {
        assertFalse(Testlogin.validatePassword("Araavdh!"));
    }
    
    //here if the entered password has no numerical value the password will be invalid once again

    @Test
    public void testValidatePassword_Invalid_NoSpecialChar() 
    {
        assertFalse(Testlogin.validatePassword("Araav123"));
    }
    
    //here if the entered password has no special character it would be invlaid once again
}


//reference
//the refernece used in this unit test is mrs Fatimas video
//https://youtu.be/sFTbCVnUbLo?si=_5laLjZNENT4XAyj
//the above is the link to the video