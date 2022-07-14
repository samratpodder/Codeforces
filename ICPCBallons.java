import java.util.*;
public class ICPCBallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String ball = sc.nextLine();
            Set<Character> set = new HashSet<>();
            long res = 0;
            for (Character character : ball.toCharArray()) {
                if(set.contains(character)){
                    res+=1;
                } 

                else{
                    res+=2;
                    set.add(character);
                } 
            }
            System.out.println(res);
        }
    }
}
