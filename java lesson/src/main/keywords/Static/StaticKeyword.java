package main.keywords.Static;

public class StaticKeyword {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();

    }
}
