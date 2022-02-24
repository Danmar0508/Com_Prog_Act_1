import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        char[] strArr = input.toCharArray();
        int count; 
        System.out.println("Duplicate characters are:");
        for(int i = 0; i <strArr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <strArr.length; j++) {  
                if(strArr[i] == strArr[j] && strArr[i] != ' ') {  
                    count++;  
                    strArr[j] = '0';  
                }  
            }  
            if(count > 1 && strArr[i] != '0')  
                System.out.println(strArr[i]+"\t"+(count-1)+" duplicates");  
        }  
    }
}
