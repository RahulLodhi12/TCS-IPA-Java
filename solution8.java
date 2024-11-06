import java.util.*;

public class solution8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Laptop[] arr = new Laptop[4];
        for(int i=0;i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Laptop(a,b,c,d,e);
        }

        String brand = sc.nextLine();

        String osType = sc.nextLine();

        int count = countOfLaptopsByBrand(arr,brand);
        if(count==0) System.out.println("The given brand is not available");
        else System.out.println(count);


        Laptop[] res = searchLaptopByOsType(arr, osType);
        if(res==null) System.out.println("The given os is not available");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i].getLaptopId());
                System.out.println(res[i].getRating());
            }
        }
    }

    public static int countOfLaptopsByBrand(Laptop[] arr, String brand){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand) && arr[i].getRating()>3){
                cnt++;
            }
        }
        return cnt;
    }

    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String osType){
        Laptop[] arr2 = new Laptop[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getOsType().equalsIgnoreCase(osType)){
                arr2 = Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
                Arrays.sort(arr2, (a1,a2) -> Integer.compare(a2.getLaptopId(), a1.getLaptopId()));
            }
        }
        if(arr2.length==0) return null;
        return arr2;
    }
}

class Laptop{
    int laptopId;
    String brand;
    String osType;
    double price;
    int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating){
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId(){
        return laptopId;
    }

    public void setLaptopId(int laptopId){
        this.laptopId = laptopId;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getOsType(){
        return osType;
    }

    public void setOsType(String osType){
        this.osType = osType;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }
}

/*

Input

123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
HP
windows
40000
4
HP
windows

Output 1
2
126
4
123
5

Input 2
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
Asus
windows
40000
3
HP1
Ubuntu1


Output 2
The given brand is not available
The given os is not available

*/
