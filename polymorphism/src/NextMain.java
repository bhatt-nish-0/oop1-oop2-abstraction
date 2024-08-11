public class NextMain {

    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("A","Jaws");
//        movie.watchMovie();

        //Adventure jaws = Movie.getMovie("A","Jaws");

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

//        Adventure jaws2 = (Adventure) Movie.getMovie("C","Jaws");
//        jaws.watchMovie();


        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObj = Movie.getMovie("C","Airplane");

        if (unknownObj.getClass().getSimpleName().equals("Comedy")) {
            System.out.println("inside here bro!");
            Comedy c = (Comedy) unknownObj;
            c.watchComedy();
        } else if (unknownObj instanceof Adventure) {
            System.out.println("in here!");
            ((Adventure) unknownObj).watchAdventure();
        } else if (unknownObj instanceof ScienceFiction syfy) {
            System.out.println("now in here!");
            syfy.watchSciFi();
        }


    }

}
