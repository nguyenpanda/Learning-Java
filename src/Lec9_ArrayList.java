import java.util.ArrayList;

public class Lec9_ArrayList {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 9.1 - Array List" + Color.RESET);

        ArrayList<String> food = new ArrayList<String>();

        food.add("Cake");
        food.add("Candy");
        food.add("Pizza");

        food.set(1, "Sushi");
//        food.remove(0);
//        food.clear();

        for (String s : food) {
            System.out.print(s + " -> ");
        }
        System.out.println();
    }

    public static void Lec2() {
        System.out.println(Color.CYAN + "Lec 9.2 - Array List" + Color.RESET);

        ArrayList<ArrayList<String>> genre = new ArrayList<>();

        ArrayList<String> romantic = new ArrayList<String>();
        romantic.add("Romeo and Juliet");
        romantic.add("Flipped");
        romantic.add("Love, Rosie");

        ArrayList<String> action = new ArrayList<String>();
        action.add("Fast and Furious");
        action.add("John Wick");
        action.add("Fury");

        ArrayList<String> fantasy = new ArrayList<String>();
        fantasy.add("The Witcher");
        fantasy.add("The Hobbits");
        fantasy.add("The last witch hunter");

        genre.add(romantic);
        genre.add(action);
        genre.add(fantasy);

        for (ArrayList<String> each_genre : genre) {
            for (String each_film : each_genre) {
                System.out.print(each_film + " -> ");
            }
            System.out.println();
        }
    }

}
