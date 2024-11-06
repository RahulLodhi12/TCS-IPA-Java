import java.util.Scanner;

public class cntSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt=0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                cnt++;
            }
        }

        if(cnt>=3) System.out.println(cnt);
        else System.out.println("NA");
    }
}
