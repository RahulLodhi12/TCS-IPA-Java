import java.util.Scanner;

public class vowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split(" ");
        String vowel = "aeiouAEIOU";
        String res="";

        for(int i=0;i<words.length;i++){
            String st = words[i];
            char ch = st.charAt(0);

            if(vowel.indexOf(ch)>-1){
                res+=ch;
            }
        }

        System.out.println(res);
    }
}
