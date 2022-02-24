import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String s1, s2, temp1, temp2;
        char[] c1, c2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first string:");
        s1 = scanner.nextLine();
        System.out.println("enter second string:");
        s2 = scanner.nextLine();
        temp1 = s1.toLowerCase();
        temp1 =temp1.replaceAll(" ", "");
        temp2 = s2.toLowerCase();
        temp2 = temp2.replaceAll(" ", "");
        c1 = temp1.toCharArray();
        c2 = temp2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Boolean result = Arrays.equals(c1, c2);
        if(result){
            System.out.println(s1+" "+s2+" are anagram");
        } else {
            System.out.println(s1+" "+s2+" are not anagram");
        }
    }
}
