import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for movie information
        System.out.println("Enter the name of a movie: ");
        String title = scanner.nextLine();
        
        System.out.println("Enter the rating of the movie: ");
        String rating = scanner.nextLine();
        
        System.out.println("Enter the number of tickets sold for this movie: ");
        int ticketsSold = scanner.nextInt();
        
        // Create a new Movie object
        Movie movie = new Movie();
        
        // Set the properties using the user input
        movie.setTitle(title);
        movie.setRating(rating);
        movie.setSoldTickets(ticketsSold);
        
        // Print out the movie's information
        System.out.println(movie.toString());
        System.out.println("Goodbye");
        
        // Close the scanner
        scanner.close();
    }
}
