import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println(convertDecimalNumbersToBinary(101));

    }

    public static boolean checkForPalindromeQueue(String text) {


        Stack<Character> stack = new Stack<>();

        Queue<Character> queue = new LinkedList<>();
        text = text.toLowerCase(Locale.ENGLISH);
        char[] chars = text.toCharArray();
        for(char ch : chars){
            if(ch >= 'a' && ch <= 'z'){
                stack.push(ch);
                queue.add(ch);

                        // add hata fırlatır, offer fırlatmaz -- element => head peek (hata vermez) -- remove hata vermez

            }
        }
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                return false;
            }
        }
        System.out.println(stack);
        System.out.println(queue);
        return true;





    }

    public  static boolean checkForPalindrome(String text) {
        text = text.toLowerCase(Locale.ENGLISH);

        ArrayList<Character> textAsArray = new ArrayList<>();

        Stack<Character> textAsStack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                textAsArray.add(text.charAt(i));
                textAsStack.push(text.charAt(i));
            }
        }

        System.out.println(textAsArray);
        System.out.println(textAsStack);

        for (char ch : textAsArray) {
            if (ch != textAsStack.pop()) {
                return false;
            }
        }

        return true;
    }
    public static String convertDecimalNumbersToBinary(int number) {

      final int taban = 2;
      Stack<Integer> basamak = new Stack<>();
      while (number>= 1){
          basamak.push(number%taban);
          number = number / taban;

      }
      String result = "";
      while (!basamak.isEmpty()){
          result += basamak.pop();

      }
      return result;
        /*
        101
        101/2 kalan 1
        50/2 kalan 0
        25/2 kalan 1
        12/2 kalan 0
        6/2  kalan 0
        3/2  kalan 1
        1 kalan 1

        1100101

        42
        42/2 kalan 0
        21/2 kalan 1
        10/2 kalan 0
        5/2 kalan 1
        2/2 kalan 0
        1 kalan 1

        101010

         */
    }
}
