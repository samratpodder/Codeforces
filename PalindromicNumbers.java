import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int size = sc.nextInt();
            long num = sc.nextInt();
            String numtobe = new String();
            while (size>0) {
                numtobe+="9";
                size--;
            }
            long numtobeint = Long.parseLong(numtobe);
            if (numtobeint<=num) {
                size = numtobe.length();
                numtobe="";
                for (int i = 0; i <= size; i++) {
                    numtobe+="1";
                }
            }
            numtobeint = Long.parseLong(numtobe);
            // System.out.println(numtobe);
            System.out.println(numtobeint-num);
        }
    }
}
