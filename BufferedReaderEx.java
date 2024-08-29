import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx {
    public static void main(String[] args)throws Exception {
        File dir = new File("PwJava");
        File file = new File(dir,"pwsills.txt");

        FileReader fw = new FileReader(file);
        BufferedReader br = new BufferedReader(fw);

        String Line = br.readLine();
        while (Line!=null)
        {
            System.out.println(Line);
            Line = br.readLine();
        }


    }
}
