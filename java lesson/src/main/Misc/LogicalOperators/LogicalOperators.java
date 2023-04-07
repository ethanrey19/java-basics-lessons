package main.Misc.LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions

        // && = (AND) both conditions must be true
        // || = (OR) either condition much be true
        // ! = (NOT) reverses boolean value of condition


        /* && (AND) Example :

        int temp = 15;

        if(temp > 30){
            System.out.println("It is hot outside!");
        }else if (temp >= 20 && temp <= 30){
            System.out.println("It is warm outside");
        }else {
            System.out.println("It is cold outside");
        }

         */


        /* || (OR) Example :

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game!");
        }else {
            System.out.println("You are still playing the game");
        }

         */


        /* ! (NOT) Example :

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game");
        }else {
            System.out.println("You quit the game");
        }

         */
    }
}