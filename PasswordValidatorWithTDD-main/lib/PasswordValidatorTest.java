package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123"  ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed:"+ pw+ " :Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        } 
        // Test Case 2: รหัสผ่านตัวเลขซ้ำกันควรจะ WEAK

        
        PasswordStrength result2 = PasswordValidator.validate(pw);
        pw = "11111111";
        if(result2 == PasswordStrength.WEAK){
            System.out.println("Test Case 2  Passed:"+ pw+ " :Short password is WEAK.");
        }else {
            System.out.println("Test Case 2 FAILED:"+ pw+ " :Expected WEAK but got "+ result2);
        }

        //Test Case 3: รหัสผ่านเป็นตัวอักษรengตัวเล็ก ตัวใหญ่ ควรขะ MEDIUM
        PasswordStrength result3 = PasswordValidator.validate(pw);
        pw = "Maxfasfgt";
        if(result3 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 3  Passed:"+ pw+ " :Short password is MEDIUM.");
            }else {
            System.out.println("Test Case 3 FAILED:"+ pw+ " :Expected MEDIUM but got " + result3);
            }
            PasswordStrength result4 = PasswordValidator.validate(pw);
        pw = "Max20061";
        if(result4 == PasswordStrength.STRONG){
            System.out.println("Test Case 4  Passed:"+ pw+ " :Short password is STRONG.");
            }else {
            System.out.println("Test Case 4 FAILED:"+ pw+ " :Expected STRONG but got " + result4);
            }
            PasswordStrength result5 = PasswordValidator.validate(pw);
        pw = "maxangryy";
        if(result5 == PasswordStrength.WEAK){
            System.out.println("Test Case 5  Passed:"+ pw+ " :Short password is WEAK.");
            }else {
            System.out.println("Test Case 5 FAILED:"+ pw+ " :Expected WEAK but got " + result5);
            }


                

            
        }

        

        
    }


