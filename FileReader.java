import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileReader
{
    public static void main(String[] args)
    {
        if (args.length == 0) {System.out.println("Error. Enter args!"); return;}
        try(var in = new Scanner(System.in))
        {
            while(true)
            {
                System.out.println("1. Output your file\n2. Exit");
                int n = in.nextInt(), cnt = args.length;
                switch (n)
                {
                    case 1:
                    {
                        HashMap<Integer, List<String>> map = new HashMap<>();
                        for (int i = 0; i < cnt; i++)
                        {
                            map.put(i + 1, Files.readAllLines(Paths.get(args[i])));
                        }
                        System.out.print("What file you want to chose?\nEnter num: ");
                        System.out.println(map.get(in.nextInt()));
                        break;
                    }
                    default:
                        return;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}