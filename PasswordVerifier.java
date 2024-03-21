public class PasswordVerifier extends PasswordManager{


       public static boolean isValid(String password) {
         return hasUpperCase(password) && hasLowerCase(password) && hasDigit(password) && isLengthValid(password);
       }
   
       public static boolean hasUpperCase(String password) {
         for(char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
               return true;
            }
         }
         return false;
       }

       public static boolean hasLowerCase(String password) {
         for(char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
               return true;
            }
         }
         return false;
       }

       public static boolean hasDigit(String password) {
         for(char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
               return true;
            }
         }
         return false;
       }
   public static boolean isLengthValid(String password) {
      return password.length() >= 8;
      }
	 }