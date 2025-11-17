import java.io.*;
import java.util.*;

public class Persister
{
    public static void save(ArrayList<User> users) throws IOException
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt")))
        {
            for (User user : users)
            {
                bw.write(user.getId() + ": " + user.getName());
                bw.newLine();
            }
        }
    }
}
