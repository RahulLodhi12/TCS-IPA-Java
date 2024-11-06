import java.util.*;

public class lowerCase{

	public static void main(String[] args){

		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') cnt++;
		}
		
		if(cnt==0) System.out.println("No lower case characters present");
		else System.out.println(cnt);
	
	}

}