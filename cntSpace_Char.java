import java.util.Scanner;

public class cntSpace_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int sp=0;
        int ch=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sp++;
            }
            else{
                ch++;
            }
        }

        System.out.println(sp+" "+ch);

    }
}
