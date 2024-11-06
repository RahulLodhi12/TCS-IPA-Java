import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone[] arr = new Phone[4];
        for(int i=0;i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            arr[i] = new Phone(a,b,c,d);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int sum = findPriceForGivenBrand(arr,brand);
        if(sum==0)System.out.println("The given Brand is not available");
        else System.out.println(sum);

        
        Phone res = getPhoneIdBasedOnOs(os, arr);
        if(res==null) System.out.println("No phones are available with specified os and price range");
        else System.out.println(res.getPhoneId());
    }

    public static int findPriceForGivenBrand(Phone[] arr, String brand){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                sum+=arr[i].getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(String os, Phone[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice()>=50000){
                return arr[i];
            }
        }
        return null;
    }
}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    
    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }


    public int getPhoneId() {
        return phoneId;
    }


    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }


    public String getOs() {
        return os;
    }


    public void setOs(String os) {
        this.os = os;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

}

/*

Input
--------------
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output
------------------
The given Brand is not available
222

*/
