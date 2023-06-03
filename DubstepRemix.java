
    import java.util.Scanner;

    public class DubstepRemix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the dubstep remix of the song");
            String remix = scanner.nextLine();

            String originalSong = restoreOriginalSong(remix);
            System.out.println("The words of the initial song");
            System.out.println("Original song: " + originalSong);
        }

        private static String restoreOriginalSong(String remix) {
            // Remove multiple occurrences of "WUB" and replace with a single space
            String original = remix.replaceAll("WUB+", " ");

            // Remove leading and trailing spaces
            original = original.trim();

            return original;
        }
    }

