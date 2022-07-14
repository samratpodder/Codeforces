import java.util.*;
import java.io.*;
class XORMixup{
    static int getXOR(int i, int n, int[] arr)
    {
        // System.out.println("-----");
        int res = 0;
        boolean flag = true;
        for (int j = 0; j < n; j++) {
            // System.out.println(res);
            if(i==j) continue;
            if(flag)
            {
                res = arr[j];
                flag = false;
                continue;
            }
            res = res^arr[j];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i =0;i<n;i++)
            {
                if(arr[i] == getXOR(i,n,arr)){
                    // System.out.println("tc"+tc);
                    System.out.println(arr[i]);
                    break;
                }
                // System.out.println("arr[i] "+arr[i]+ "  getXOR = "+getXOR(i,n,arr));
            }
        }
    }
}