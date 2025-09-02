import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(readFromFile("links.txt"));
    }

    public static String readFromFile(String fileName) {
        File file = new File(fileName);
        String outputString = "";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            outputString = bufferedReader.readLine();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }

        return outputString;

    }
}