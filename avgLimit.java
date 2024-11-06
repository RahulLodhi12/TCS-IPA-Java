import java.util.Scanner;

public class avgLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt(); sc.nextLine();
        }

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        
        int sum=0;
        int cnt=0;
        
        for(int i=0;i<5;i++){
            if(arr[i]>l1 && arr[i]<l2){
                sum+=arr[i];
                cnt++;
            }
        }
        
        int avg = sum/cnt;
        
        System.out.println(avg);
        
	}
}
