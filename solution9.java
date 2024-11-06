import java.util.*;

public class solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for(int i=0;i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();

            arr[i] = new Hotel(a,b,c,d,e,f);
        }

        String month = sc.nextLine();

        String wifi = sc.nextLine();

        int count = noOfRoomsBookedInGivenMonth(arr,month);
        if(count==0) System.out.println("No rooms booked in the given month");
        else System.out.println(count);

        Hotel[] res = searchHotelByWifiOption(arr,wifi);
        if(res==null) System.out.println("No such option available");
        else System.out.println(res[res.length-2].getHotelId());
    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String month){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            String sub = arr[i].getDateOfBooking().substring(3,6);
            if(sub.equalsIgnoreCase(month)){
                cnt=arr[i].getNoOfRoomsBooked();
            }
        }
        return cnt;
    }

    public static Hotel[] searchHotelByWifiOption(Hotel[] arr, String wifi){
        Hotel[] arr2 = new Hotel[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getWifiFacility().equalsIgnoreCase(wifi)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
                Arrays.sort(arr2, (a1,a2)->Double.compare(a1.getTotalBill(), a2.getTotalBill()));
            }
        }
        if(arr2.length==0) return null;
        return arr2;
    }
}

class Hotel{
    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;


    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility,
            double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }


    public int getHotelId() {
        return hotelId;
    }


    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    public String getHotelName() {
        return hotelName;
    }


    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    public String getDateOfBooking() {
        return dateOfBooking;
    }


    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }


    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }


    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }


    public String getWifiFacility() {
        return wifiFacility;
    }


    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }


    public double getTotalBill() {
        return totalBill;
    }


    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
  
}
/*

Input 1
101
Best Stay
01-Jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes


Output 1
5
103

*/
