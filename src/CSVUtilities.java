import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class CSVUtilities
{
    ArrayList<String> CSVData = new ArrayList<>();
    int numColumns;

    public CSVUtilities(File csv)
    {
        List<String> scores = new ArrayList<>();
        Path pathToFile = Paths.get(csv.getName());

        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {
            String line = br.readLine();
            while(line != null)
            {
                String[] attributes = line.split(",");
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public List<String> getColumnHeaders()
    {

    }

    public List<Integer> getDataString(int column)
    {

    }

    public List<Double> getDataDouble(int column)
    {

    }
}
