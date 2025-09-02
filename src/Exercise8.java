import java.io.*;
import java.util.Random;

public class Exercise8 {

    public static void main(String[] args) {
        String filename = "random_number.txt";
        createFileWithRandomNumber(filename);
        System.out.println("Your random number is: " + readFromFile(filename));
    }

    public static void createFileWithRandomNumber(String filename){

        Random random = new Random();
        int randomInt = random.nextInt(100);
        String str = String.valueOf(randomInt);

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(str);
            System.out.println("File created successfully: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }

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
