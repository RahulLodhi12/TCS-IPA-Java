import java.util.Scanner;

public class smallLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
