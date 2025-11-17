import java.io.*;
import java.util.*;

public class Persister
{
    public static void save(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create FileWriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for (int i = 0; i < users.size() - 1; i++) // Create a loop
        { // Nicely formatted block
            bw.write(users.get(i).name); // Write first thing
            bw.write(users.get(i).getId()); // Write second thing
        } // Ending parenthesis
    }
}
