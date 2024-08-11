import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("star wars");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = new Adventure("jumanji");
//        theMovie2.watchMovie();

//        Movie theMovie3 = Movie.getMovie("Science","Star Wars");
//        theMovie3.watchMovie();
//
//
//        Movie theMovie4 = Movie.getMovie("Adventure","jumanji");
//        theMovie4.watchMovie();

          Scanner s = new Scanner(System.in);

          while (true) {
              System.out.println("Entery type ... or q to quit");
              String type = s.nextLine();

              if ("Qq".contains(type)) {
                  break;
              }

              System.out.println("enter movie's title");
              String title = s.nextLine();

              Movie movie = Movie.getMovie(type,title);
              movie.watchMovie();

          }


    }
}
