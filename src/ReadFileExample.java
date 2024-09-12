import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            // Create a FileReader and wrap it in BufferedReader
            FileReader fr = new FileReader("/home/abubaker/Desktop/example.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // FileWriter to write to the file
            FileWriter fileWriter = new FileWriter("/home/abubaker/Desktop/example.txt"); // 'true' for appending
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine(); // Writing a new line
            bufferedWriter.write("This is a new line of text.");

            // Close resources
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

