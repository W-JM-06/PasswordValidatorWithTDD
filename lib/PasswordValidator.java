package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength INVALID อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        int minLength = 8;
        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int countSP= 0 ;

        if(password== null || password.length()<minLength){
        return PasswordStrength.INVALID;}

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){countLower++;}
            else if(Character.isUpperCase(c)){countUpper++;}
            else if(Character.isDigit(c)){countNum++;} else{countSP++;}
        }    
        
    if(countNum==password.length() || countLower == password.length()){
        return PasswordStrength.WEAK;
    }
    if((countUpper > 0) && (countLower >0) && (countSP == 0)) {
        return PasswordStrength.MEDIUM;
    }
     
        return PasswordStrength.STRONG;
    }


    }

