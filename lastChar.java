import java.util.Scanner;

public class lastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split(" ");

        String res="";

        for(int i=0;i<words.length;i++){
            String st = words[i];
            char ch = st.charAt(st.length()-1);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                res += ch;
            }
        }

        System.out.println(res);

    }    

}
