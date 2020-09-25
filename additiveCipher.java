import java.util.Scanner;

public class additiveCipher {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.next();
        int key = scn.nextInt();

        String newtext = encryptAdditive(text,key);
        System.out.println(newtext);
        System.out.println(decryptAdditive(newtext,key));
    }

    public static String encryptAdditive(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char c = (char) (((int) text.charAt(i) + key - 'A') % 26 + 'A');
                sb.append(c);
            } else {
                char c = (char) (((int) text.charAt(i) + key - 'a') % 26 + 'a');
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decryptAdditive(String text,int key){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char c = (char) (((int) text.charAt(i) - key - 'A') % 26 + 'A');
                sb.append(c);
            } else {
                char c = (char) (((int) text.charAt(i) - key - 'a') % 26 + 'a');
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
