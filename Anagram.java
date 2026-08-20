import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {

            char arr[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr);
            Arrays.sort(arr2);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        System.out.println("Anagram: " + result);

        sc.close();
    }
}