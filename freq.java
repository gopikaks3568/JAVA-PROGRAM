import java.util.Scanner;

class freq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Enter the character:");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("frequency of the character-" + ch + ":" + count);
    }
}