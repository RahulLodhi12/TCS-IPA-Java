import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] word = str.split(" ");

        String res="";

        for(int i=word.length-1;i>=0;i--){
            res+=word[i];
            if(i!=0) res+=" ";
        }

        System.out.println(res);

    }
}
