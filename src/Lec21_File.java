import java.io.*;

public class Lec21_File {
    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 21.1 - File\n" + Color.RESET);

        File file = new File("/Users/hatuongnguyen/Desktop/Computer/Coding/Java/LearnJava/README.md");
        if(file.exists()) {
            System.out.println(Color.CYAN + "That file exists!" + Color.RESET);
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
        }
        else {
            System.out.println(Color.RED + "That file doesn't exist!" + Color.RESET);
        }
    }

    public static void Lec2() {
        System.out.println(Color.CYAN + "Lec 21.2 - File\n" + Color.RESET);

        // FileWriter must be in try-catch block

        try {
            FileWriter file = new FileWriter("Lec21_Poem.txt");

            file.write("Roses are red!\n");
            file.write("Violet are blue!\n");
            file.append("\t Tuong Nguyen the poet");

            file.close();
        } catch (FileNotFoundException error) {
            System.out.println(Color.RED + "File not found!" + Color.RESET);
        }  catch (IOException error) {
            throw new RuntimeException(error);
        }
    }

    public static void Lec3() {
        System.out.println(Color.CYAN + "Lec 21.3  - File\n" + Color.RESET);

        // FileReader = read the contents of a file as a stream of characters. One by one
        //              read() returns an value int value which contains the byte value
        //              read() when returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("Lec21_PlayBoiz.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            System.out.println();
            reader.close();
        } catch (FileNotFoundException error) {
            System.out.println(Color.RED + "File not found!" + Color.RESET);
        }  catch (IOException error) {
            throw new RuntimeException(error);
        }
    }

}
