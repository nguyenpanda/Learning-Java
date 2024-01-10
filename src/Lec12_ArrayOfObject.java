public class Lec12_ArrayOfObject {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 12.1 - Array of Object" + Color.RESET);

        Box[] groupOfBox = new Box[3];

        Box blackBox = new Box("blackBox");
        Box paperBox = new Box("paperBox");
        Box smallBox = new Box("smallBox");

        groupOfBox[0] = blackBox;
        groupOfBox[1] = paperBox;
        groupOfBox[2] = smallBox;

        for (int i = 0; i < 3; i++) {
            System.out.println(groupOfBox[i].toStr());
        }
    }

    private static class Box {

        String name;

        Box(String name) {
            this.name = name;
        }

        String toStr() {
            return name;
        }

    }

}
