import java.util.Arrays;
import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        for(int i=0;i<4;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Movie(a,b,c,d);
        }
        
        String serachGenre = sc.nextLine();

        Movie[] res = getMovieByGenre(arr,serachGenre);
        for(int i=0;i<res.length;i++){
            if(res[i].getBudget()>80000000){
                System.out.println("High Budget Movie");
            }
            else{
                System.out.println("Low Budget Movie");
            }
        }
    }

    public static Movie[] getMovieByGenre(Movie[] arr, String serachGenre){
        Movie[] arr2 = new Movie[0];
        for(int i=0;i<arr.length;i++){
             if(arr[i].getGenre().equalsIgnoreCase(serachGenre)){
                arr2=Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1]=arr[i];
             }
        }
        return arr2;
    }
}

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

}

/*
Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie


*/
