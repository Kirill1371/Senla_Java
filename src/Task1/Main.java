// package Task1;

// public class Main {
    
// }
// Task #1
package Task1;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final String[] WORDS = {"STUDENT", "SENLA", "DEVELOPER", "JAVA", "PROGRAMMING"};
    private static final int MAX_LIVES = 6;

    public static void main(String[] args) {
        Random random = new Random();
        String wordToGuess = WORDS[random.nextInt(WORDS.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int lives = MAX_LIVES;
        boolean wordGuessed = false;
        Scanner scanner = new Scanner(System.in);

        while (lives > 0 && !wordGuessed) {
            System.out.println("Слово: " + new String(guessedWord));
            System.out.println("Осталось жизней: " + lives);
            drawHangman(MAX_LIVES - lives);

            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().toUpperCase().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                lives--;
            }

            wordGuessed = new String(guessedWord).equals(wordToGuess);
        }

        if (wordGuessed) {
            System.out.println("Congratulations! Вы угадали слово: " + wordToGuess);
        } else {
            drawHangman(MAX_LIVES);
            System.out.println("Wasted. Загаданное слово было: " + wordToGuess);
        }

        scanner.close();
    }

    private static void drawHangman(int livesLost) {
        switch (livesLost) {
            case 0:
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 1:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 2:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 5:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("    ===");
                break;
            case 6:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("    ===");
                break;
        }
    }
}
