import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExer {
    public static void main(String[] args) {
        System.out.println("Enter something:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        System.out.println("Input isNumeric: " + StringUtils.isNumeric(userInput));
        System.out.println("Input swapcase: " +StringUtils.swapCase(userInput));
        System.out.println("Input reversed: " + StringUtils.reverse(userInput));



    }
}
