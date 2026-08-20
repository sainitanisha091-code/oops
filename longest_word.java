import java.util.Scanner;

class StringOperations {

    public static String longestWord(String str) {
        String max = "";
        int maxx = 0;

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxx) {
                max = words[i];
                maxx = words[i].length();
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = longestWord(str);

        System.out.println("Longest word: " + result);

        sc.close();
    }
}