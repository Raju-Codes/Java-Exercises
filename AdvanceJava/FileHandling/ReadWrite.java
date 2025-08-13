import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("input.txt");

        if (f.exists()) {

            FileReader fr = new FileReader(f);
            int ch;
            char c;
            StringBuilder sb = new StringBuilder()

            while ((ch = fr.read()) != -1) {
                System.out.print(c = (char) ch);
                sb.append(c);
            }
            fr.close();

            File f2 = new File("output.txt");
            FileWriter fw2 = new FileWriter(f2);
            fw2.write(sb.toString());
            fw2.close();

        } else {
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            String str = sc.nextLine();
            fw.write(str);
            fw.close();
        }

        sc.close();
    }
}
