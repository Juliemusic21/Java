/* Julie Sakai
CSD-405
Module 5 Programming Assignment
Program 2
11/16/24 */

import java.io.*;
import java.util.Random;

public class FileProgram {
    private static final String fileName = "data.file";

    public static void main(String[] args) {
        try {
            createFile();
            writeToFile();
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Create a new file titled data.file if the file does not exist
    public static void createFile() throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("New file created: " + fileName);
        }
    }

    //Write 10 randomly generated numbers to a previous file
    public static void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            bufferedWriter.write(String.valueOf(randomNumber));
            bufferedWriter.write( " ");
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Numbers written to file: " + fileName);
        }

    //Read the file and display results
    public static void readFromFile() throws IOException {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }
}

