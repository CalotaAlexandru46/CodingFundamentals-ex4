import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Introduceti elementele:");
        String str=input.nextLine();
        String[] elements=str.split(" ");
        for(String e:elements){
            if(Pattern.matches(".*?a.*?b.*?c.*?",e)) System.out.println(e+" ");
        }

    }
}
