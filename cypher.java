import java.util.*;
public class cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] config = new int[n];
            for (int i = 0; i < config.length; i++) {
                config[i] = sc.nextInt();
            }
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String[] moves = sc.nextLine().split(" ");
                int pos = 0;
                for (Character character : moves[1].toCharArray()) {
                    if(character == 'D') pos+=1;
                    if (character=='U') pos-=1;
                }
                if(pos>0){
                    System.out.print((config[i]+pos)%10);
                    System.out.print(" ");
                }
                else if(pos<0){
                    // int curr = Integer.parseInt(""+moves[1].charAt(i));
                    pos += config[i];
                    System.out.print((10+pos)%10+" ");
                }
                else{
                    System.out.print(config[i]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
