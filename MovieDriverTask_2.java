import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Initialize scanner once.
        char userAnswerLoop;

        do {
            Movie movie = new Movie();  // Create new Movie object in each loop iteration.

            // Prompt user for movie information
            System.out.println("Enter the name of a movie");
            String title = scanner.nextLine();

            System.out.println("Enter the rating of the movie");
            String rating = scanner.nextLine();

            System.out.println("Enter the number of tickets sold for this movie");
            int ticketsSold = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character after reading int.

            
            movie.setTitle(title);
            movie.setRating(rating);
            movie.setSoldTickets(ticketsSold);

            // Print out the movie's information
            System.out.println(movie.toString());

            // Ask the user if they want to continue and if they say yes it will be a loop until they say N or n
            System.out.println("Do you want to enter another movie? (y or n)");
            userAnswerLoop = scanner.next().charAt(0);  
            scanner.nextLine(); 

        } while (userAnswerLoop == 'y' || userAnswerLoop == 'Y');  

        
        System.out.println("Goodbye!");

        
        scanner.close();
    }
}

