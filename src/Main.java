import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ReadFile fileReader = new ReadFile("a_example.in");

        FirstLine firstLine = fileReader.firstLine;
        firstLine.getRow();
        firstLine.getColumn();
        //firstline.get infos

        ArrayList<Line> lines = new ArrayList<>();
        lines = fileReader.lines;
        Line line = lines.get(0);

        // they are all integers.
        line.getEs();
        line.getFp();
        line.getLp();
        line.getSp();
        // Object Line
    }

}
