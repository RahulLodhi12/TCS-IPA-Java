import java.util.*;

public class vowelWord{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt=0;
		Vector<String> str = new Vector<>();
		String temp="";
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch!=' '){
				temp+=ch;
			}
			else if(ch==' '){
				str.add(temp);
				temp="";
			}
		}

		for(int i=0;i<str.size();i++){
			char ch = str.get(i).charAt(0);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') cnt++;
		}
		if(cnt==0) System.out.println("No String Found");
		else System.out.println(cnt);

	}

}