public class Polindrome2 {
    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        char[] array = text.toCharArray();
        StringBuilder new_container = new StringBuilder(text.length());
        for (int i = text.length() - 1; i >= 0; i--) {
            new_container.append(array[i]);
        }
        String reversedText = new_container.toString();
        return text.equals(reversedText);
    }

    public static void main(String[] args) {
        System.out.println("Is ABBA palindrome?" + isPalindrome("ABBA"));
        System.out.println("Is pen palindrome?" + isPalindrome("pen"));
    }
}
