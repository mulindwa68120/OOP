import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide book description: ");
        String text = input.nextLine();

        String lowered = text.toLowerCase();
        String word = "uganda";
        int frequency = 0, index = 0;

        while ((index = lowered.indexOf(word, index)) != -1) {
            frequency++;
            index += word.length();
        }

        System.out.println("'Uganda' occurs " + frequency + " time(s).");
        input.close();
    }
}
