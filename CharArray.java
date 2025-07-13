import java.util.Scanner;

public class CharArray {
   
    public static void main (String []args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter: ");
        String text = input.nextLine();
        
        char [] t = text.toCharArray();
        
        for (char tt : t) {
            if (tt != ' ') 
            // if (!Character.isWhitespace(tt)) อันนี้ก็ใช้ได้
            System.out.println(tt);
    
        }
    }
}
