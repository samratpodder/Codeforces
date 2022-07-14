import java.util.*;
class E_Mirror_Grid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++) {
                String in = sc.nextLine();
                int j=0;
                for (char c : in.toCharArray()) {
                    arr[i][j] = c-'0';
                    j++;
                }
            }
            int res = 0;
            for (int i = 0; i < (arr.length+1)/2; i++) {
                for (int j = 0; j < arr.length/2; j++) {
                    int nowi = i, nowj = j;
                    int oldnowj = nowj;
                    int sum = arr[nowi][nowj];
                    nowj = n-nowi-1;
                    nowi = oldnowj;
                    sum+=arr[nowi][nowj];
                    oldnowj = nowj;
                    nowj = n-nowi-1;
                    nowi = oldnowj;
                    sum+=arr[nowi][nowj];
                    oldnowj = nowj;
                    nowj = n-nowi-1;
                    nowi = oldnowj;
                    sum+=arr[nowi][nowj];
                    res+=Math.min(sum, 4-sum);
                }
            }
            System.out.println(res);
        }
    }
}