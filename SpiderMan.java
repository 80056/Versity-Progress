public class SpiderMan {
    String movieName, directedBy;

    public SpiderMan(String movieName, String directedBy){
        this.movieName = movieName;
        this.directedBy = directedBy;
    }
    public  void show(){
       System.out.printf("Movie name "+movieName,"Directed by"+directedBy);
    }
}
