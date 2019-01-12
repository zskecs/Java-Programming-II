
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class FileManager {

    private List<String> list;

    public FileManager() {

        list = new ArrayList<String>();
    }

    public List<String> read(String file) throws FileNotFoundException {
        File read = new File(file);

        Scanner reader = new Scanner(read);

        while (reader.hasNextLine()) {
            list.add(reader.nextLine());
        }

        return list;

    }

    public void save(String file, String text) throws IOException {

        File read = new File(file);

        FileWriter writer = new FileWriter(read);

        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {

        File read = new File(file);

        FileWriter writer = new FileWriter(read);

        for (String text : texts) {
            writer.write(text + '\n');

        }
        writer.close();
    }

}
