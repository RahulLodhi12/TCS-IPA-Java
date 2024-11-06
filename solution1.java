import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            boolean e=sc.nextBoolean(); sc.nextLine();
            
            arr[i] = new TravelAgencies(a,b,c,d,e);
        }

        int regNo = sc.nextInt(); sc.nextLine();
        String packageType = sc.nextLine();

        System.out.println("Output!!");

        int maxi = findAgencyWithHighestPackagePrice(arr);
        System.out.println("maxi: "+maxi);

        
        TravelAgencies res = agencyDetailsforGivenIdAndType(arr, regNo, packageType);
        System.out.println(res.getAgencyName()+":"+res.getPrice());
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int maxi = arr[0].getPrice();
        for(int i=1;i<arr.length;i++){
            if(arr[i].getPrice() > maxi){
                maxi = arr[i].getPrice();
            }
        }
        return maxi<0 ? 0 : maxi;
    }
    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType){
        for(int i=0;i<arr.length;i++){
            if(arr[i].isFlightFacility()==true){
                if(arr[i].getRegNo()==regNo && arr[i].getPackageType().equals(packageType)){
                    return arr[i];
                }
            }
        }
        return null;
    }
}

class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    //constructor
    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    //getter and setter
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    
}


/*
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond

 */