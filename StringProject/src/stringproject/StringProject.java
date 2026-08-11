
package stringproject;

import java.util.Scanner;

public class StringProject {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String original = "4567";
        
        System.out.println("ENTER OTP = ");
        String newOTP = sc.nextLine();
        
        if (original.equals(newOTP))
        {
            System.out.println("OTP VERIFIED SUCCESSFULLY");
            
        }
        
        else
        {
            
            System.out.println("INVALID OTP");
        }
        
        System.out.println("TELL SOME CONCAT NO = ");
        String concattt = sc.nextLine();
        
        String result = original.concat(concattt);
        System.out.println("CONCAT = "+result);
        
        
    }
    
}
