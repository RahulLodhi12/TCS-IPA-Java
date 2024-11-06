import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Institution[] arr = new Institution[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();
            arr[i] = new Institution(a,b,c,d,e);
        }

        String location=sc.nextLine();
        int sum = FindNumClearancedByLoc(arr,location);
        if(sum==0) System.out.println("There are no cleared students in this particular location");
        else System.out.println(sum);

        String institutionName=sc.nextLine();
        Institution res = UpdateInstitutionGrade(institutionName, arr);
        System.out.println(res.getInstitutionName()+"::"+res.getGrade());
    }

    public static int FindNumClearancedByLoc(Institution[] arr, String location){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getLocation().equalsIgnoreCase(location)){
                sum+=arr[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution UpdateInstitutionGrade(String institutionName, Institution[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getInstitutionName().equalsIgnoreCase(institutionName)){
                int rating = (arr[i].getNoOfStudentsPlaced()*100)/(arr[i].getNoOfStudentsCleared());
                if(rating>=80){
                    arr[i].setGrade("A");
                }
                else{
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}

class Institution{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    
    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
            String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }


    public int getInstitutionId() {
        return institutionId;
    }


    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }


    public String getInstitutionName() {
        return institutionName;
    }


    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }


    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }


    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }


    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }


    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getGrade() {
        return grade;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

    
}

/*
Input
-------------------------------------------
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output
----------------------------------------
22000
Karunya::A
*/
