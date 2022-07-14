import java.util.*;
public class doubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int n = sc.nextInt();
            sc.nextLine();
            List<String> list = new ArrayList<>(n);
            HashMap<String,Boolean> map = new HashMap<>();
            String res = new String();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextLine());
                map.put(list.get(i), true);
            }
            for(int i=0;i<list.size();i++)
            {
                String c = list.get(i);
                boolean flag = false;
                for(int j = 1; j <= c.length(); j++)
                {
                    String x = c.substring(0,j);
                    String y = c.substring(j, c.length());
                    if(map.containsKey(x) && map.containsKey(y)) {
                        res+="1";
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                res+="0";
            }
            System.out.println(res);
        }
    }
}
