/**
 * @Author James Murphy (Jmurph08)
 **/
public class isPalindrome {

    public boolean isPalindrome(String s) {
        String palindrome = "";
        if(s.length() <= 1){
            return true;
        }else{
            String forward = "";
            String backward = "";
            for(int i=0; i<s.length(); i++){
                if(Character.isLetterOrDigit(s.charAt(i))){
                    forward += s.charAt(i);
                }
            }
            for(int j=s.length()-1; j>=0; j--){
                if(Character.isLetterOrDigit(s.charAt(j))){
                    backward += s.charAt(j);
                }
            }

            if((forward.toLowerCase()).equals(backward.toLowerCase())){
                return true;
            }else{
                return false;
            }

        }
    }
}
