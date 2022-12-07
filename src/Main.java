import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList();
        String str;

        System.out.printf("Instructions:\nsize: print the size of the list\nclear: remove all the elements from the list\nprint: print the list\n");

        while(true){
            System.out.println("Input a string please.");

            str = scan.nextLine();


            switch (str){
                case "size": System.out.println(list.size()); break;
                case "clear": System.out.println(list.removeAll(list)); break;
                case "print": System.out.println(list); break;
                default:
                    list.add(str);
                    break;
            }
        }
    }
}