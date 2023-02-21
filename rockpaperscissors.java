import java.util.Scanner;

import java.util.Random;

class game {
    Scanner scanner = new Scanner(System.in);
    // Random random = new Random();

    String userinput() {
        String choice = "";
        while (choice.equals("")) {
            System.out.println("Enter your choice");
            System.out.println("Press p for paper\n Press r for rock\n Press s for scissors");
            choice = scanner.nextLine();
        }
        return choice;

    }

    void Showoutput(String choice) {
        if (choice.equals("p")) {
            System.out.println("You chose paper");
        } else if (choice.equals("s")) {
            System.out.println("You chose Scissors");
        } else if (choice.equals("r")) {
            System.out.println("You chose rock");
        } else {
            System.out.println("Invalid! Check your input properly");
        }

    }

    void compoutput(int x) {
        if (x == 1) {
            System.out.println("Computer chose Rock");
        } else if (x == 2) {
            System.out.println("Computer chose Paper");
        } else if (x == 3) {
            System.out.println("Computer chose Scissors");
        }
    }

    void winner(int x, String s) {
        if (x == 1 && s.equals("r")) {
            System.out.println("Draw");
        } else if (x == 1 && s.equals("p")) {
            System.out.println("You win");
        } else if (x == 1 && s.equals("s")) {
            System.out.println("Computer wins");
        }

        else if (x == 2 && s.equals("p")) {
            System.out.println("Draw");
        } else if (x == 2 && s.equals("s")) {
            System.out.println("You win");
        } else if (x == 2 && s.equals("r")) {
            System.out.println("Computer wins");
        }

        else if (x == 3 && s.equals("s")) {
            System.out.println("Draw");
        } else if (x == 3 && s.equals("r")) {
            System.out.println("You win");
        } else if (x == 3 && s.equals("p")) {
            System.out.println("Computer wins");
        }
    }

}

public class rockpaperscissors {
    public static void main(String[] args) {
        game g = new game();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int y = random.nextInt(3) + 1;

        String get = g.userinput();
        g.Showoutput(get);

        g.compoutput(y);

        g.winner(y, get);

    }
}
