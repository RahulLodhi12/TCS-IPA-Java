import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }

        if(sum>8 && sum<50) System.out.println("Sum of odd numbers:"+sum);
        else System.out.println("NA");
    }
}
