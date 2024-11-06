import java.util.*;

public class solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];
        for(int i=0;i<4;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a,b,c,d);
        }

        String disease = sc.nextLine();

        Integer[] res = getPriceByDisease(arr, disease);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static Integer[] getPriceByDisease(Medicine[] arr, String disease){
        Integer[] arr2 = new Integer[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i].getPrice();
                Arrays.sort(arr2);
            }
        }
        return arr2;
    }
}

class Medicine{
    String MedicineName;
    String batch;
    String disease;
    int price;

    
    public Medicine(String medicineName, String batch, String disease, int price) {
        MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }


    public String getMedicineName() {
        return MedicineName;
    }


    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }


    public String getBatch() {
        return batch;
    }


    public void setBatch(String batch) {
        this.batch = batch;
    }


    public String getDisease() {
        return disease;
    }


    public void setDisease(String disease) {
        this.disease = disease;
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
-------------

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200
*/
