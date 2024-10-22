import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (char x : s.toCharArray()){
            if (x == '4' || x == '7'){
                sum++;
            }
        }
        if (sum == 4 || sum == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
