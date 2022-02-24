import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        char[] strArr = input.toCharArray();
        for(int i = 0; i<strArr.length; i++){
            int count = 0;
            for(int o = i+1; o < strArr.length; o++){
                
                if(strArr[o] == strArr[i] && strArr[o] != ' '){
                    count++;
                    strArr[o] = ' ';
                }
            }
            if(count == 0 && strArr[i] != ' '){
                System.out.println("First non-repeated character is: "+strArr[i]);
                break;
            }
        }
    }
}
