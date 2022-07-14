import java.util.*;
class optimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            long sum =0;
            for (int i = 0; i < n; i++) {
                sum+=i+1;
            }
            for (int i = 1; i < m; i++) {
                sum+=(i*n)+(n);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}