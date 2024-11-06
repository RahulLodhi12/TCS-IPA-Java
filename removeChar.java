import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String res="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
