import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testcase; i++) {
            String noti = sc.nextLine();
            System.out.println(Solve(noti));
        }
    }

    public static String Solve(String noti) {
        if (noti.length() <= 100) {
            return noti;
        }

        String chunk = noti.substring(0, 100);
        int chucuoicung = -1;
        for (int i = chunk.length() - 1; i >= 0; i--) {
            if (chunk.charAt(i) == ' ') {
                chucuoicung = i;
                break;
            }
        }
        if ( chucuoicung > 0){
             return chunk.substring(0,chucuoicung);
        }
        else{
            return chunk;
        }
    }
}