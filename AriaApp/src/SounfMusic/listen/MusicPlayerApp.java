package SounfMusic.listen;
import java.util.*;

public class MusicPlayerApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer musicPlayer = new MusicPlayer();

        while (true) {
            System.out.println("\nMusic Player Options:");
            System.out.println("1. Add Song\n2. Play Song\n3. Pause\n4. Stop\n5. Display Songs by Category\n6. Display All Songs\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter song category (Hindi/English/Telugu): ");
                    String category = scanner.nextLine();
                    System.out.print("Enter song duration (in minutes): ");
                    double duration = scanner.nextDouble();
                    musicPlayer.addSong(new Song(title, category, duration));
                    break;
                case 2:
                    System.out.print("Enter the title of the song to play: ");
                    String playTitle = scanner.nextLine();
                    musicPlayer.playSong(playTitle);
                    break;
                case 3:
                    musicPlayer.pause();
                    break;
                case 4:
                    musicPlayer.stop();
                    break;
                case 5:
                    System.out.print("Enter category to filter songs (Hindi/English/Telugu): ");
                    String filterCategory = scanner.nextLine();
                    musicPlayer.displaySongsByCategory(filterCategory);
                    break;
                case 6:
                    musicPlayer.displayAllSongs();
                    break;
                case 7:
                    System.out.println("Exiting Music Player. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
