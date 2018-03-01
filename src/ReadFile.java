import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    private ArrayList<Line> lines = new ArrayList<>();
    private FirstLine firstLine;

    public ReadFile(String s) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("a_example.in"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine(); // read first line, 6 arguments
            String[] lineArray = line.split(" ");
            firstLine = new FirstLine(lineArray);

            // all the other lines
            while (br.ready()) {
                line = br.readLine(); // 5 arguments
                lineArray = line.split(" ");

                StartingPoint sp = new StartingPoint(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]));
                FinishPoint fp = new FinishPoint(Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3]));
                EarliestStart es = new EarliestStart(Integer.parseInt(lineArray[4]));
                LatestFinish lf = new LatestFinish(Integer.parseInt(lineArray[5]));


                Line objLine = new Passenger(sp,fp,es,lf);
                lines.add(objLine);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public FirstLine getFirstLine() {
        return firstLine;
    }
}

