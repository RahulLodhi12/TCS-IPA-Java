import java.util.Arrays;
import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] arr = new Inventory[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            int b=sc.nextInt(); sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            
            arr[i] = new Inventory(a,b,c,d);
        }

        int limit = sc.nextInt();

        Inventory[] res = Replenish(arr, limit);

        for(int i=0;i<res.length;i++){
            if(res[i].getThreshold() > 75){
                System.out.println(res[i].getInventoryId()+" Critical Filing");
            }
            else if(res[i].getThreshold() > 50 && res[i].getThreshold() < 75){
                System.out.println(res[i].getInventoryId()+" Moderate Filing");
            }
            else{
                System.out.println(res[i].getInventoryId()+" Non-Critical Filing");
            }
        }

    }

    public static Inventory[] Replenish(Inventory[] arr, int limit){
        Inventory[] arr2 = new Inventory[0]; //empty array
        for(int i=0;i<arr.length;i++){
            if(limit >= arr[i].getThreshold()){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        return arr2;
    }

}

class Inventory{
    int inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
 
}


/*
Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
*/
