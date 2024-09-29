public class Main {
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i+1) == "("){
                countA = countA + 1;
            }
            if (str.substring(i, i+1) == ")"){
                countB = countB - 1;
            }
        }
        if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')' && countA == countB){
            return true;
        }
        else{
            return false;
        }
    }
    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String a = n + "";
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
        return reverse;
    }
    // 3. encryptThis
    public static String encryptThis(String helloGoodDay) {
        String[] charactersInAnOrganizedFashion = helloGoodDay.split(" ");
        String encryptStr = "";
        for (String word: charactersInAnOrganizedFashion) {
            int firstChar = (int) word.charAt(0);
            String encryptWord = firstChar + "";
            if (word.length() == 2){
                char secondChar = word.charAt(1);
                encryptWord += secondChar;
            }
            else {
                char lastChar = word.charAt(word.length() - 1);
                char secondChar = word.charAt(1);
                encryptWord += lastChar;
                if (word.length() > 2) {
                    encryptWord += word.substring(2, word.length() - 1);
                }
                encryptWord += secondChar;
            }
            encryptStr += encryptWord + " ";
        }
        encryptStr = encryptStr.substring(0, encryptStr.length() - 1);
        return encryptStr;
    }
    // 4. decipherThis
    public static String decipherThis(String s) {
        String[] charactersInAnOrganizedFashion = s.split(" ");
        String decryptStr = "";
        for (String word: charactersInAnOrganizedFashion) {
            String charCode = "";
            int i = 0;
            while (i < word.length() && (word.charAt(i) >= '0' && word.charAt(i) <= '9')){
                charCode += word.charAt(i);
                i++;
            }
            char firstChar = (char) Integer.parseInt(charCode);
            String decryptWord = firstChar + "";
            if (word.length() == i + 1){
                char secondChar = word.charAt(i);
                decryptWord += secondChar;
            }
            else {
                char secondChar = word.charAt(i);
                char lastChar = word.charAt(word.length() - 1);
                decryptWord += lastChar;
                if (i + 1 < word.length() - 1){
                    decryptWord += word.substring(i + 1, word.length() - 1);
                }
                decryptWord += secondChar;
            }
            decryptStr += decryptWord + " ";
        }
        decryptStr = decryptStr.substring(0, decryptStr.length() - 1);
        return decryptStr;
    }
}