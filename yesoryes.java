import java.util.*;
class yesoryes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while(tc-->0)
        {
            String str = sc.nextLine().toLowerCase();
            if(str.equals("yes")) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}