import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");

        String res="";

        for(int i=0;i<word.length;i++){
            String st = word[i];

            if(st.length() > res.length()){
                res=st;
            }
        }

        System.out.println(res);
    }
}
