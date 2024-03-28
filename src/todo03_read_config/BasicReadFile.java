package todo03_read_config;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicReadFile {
    /* One way to do this class is as a utility class.
       Such classes should not be instantiated.

       A private default constructor and having no other constructors prevents
       this class being instantiated easily.
     */
    private BasicReadFile() {} // Make the default constructor private

    public static List<String> read(String filename) {
        /* TODO Use a method in the Java "new IO" (nio) library
                that lets you read all a file's lines in a single call.
         */
        List<String> lines = new ArrayList<>();
        try {
         lines = Files.readAllLines(Paths.get(filename));
      } catch (IOException e) {
         System.err.println("Error with file");
      }
        return lines;
        /* This method just calls a library method so it might seem
           superfluous: the code calling this method could have just
           called the library method directly. Think about why having this
           extra step reduces the knowledge required by whoever is writing
           the calling code, while increasing the flexibility should a
           different way of reading a file become necessary in future.
         */
    }

    public static List<Task> getProcessedFileLines(String filename) throws IOException {
    /* TODO The return signature of the getProcessedFileLines is insufficient
            it forces another method to do further processing to "understand"
            the line's structure. You need to change from a List of String
            to a List of a class-of-your-own design that holds
            all of one line's content components already separated.
            Your class could include simple metadata about the line's contents.
     */
    /* TODO In future, processing file lines will need more information
            than just the filename. Consider how to pass this information
            neatly, extensibly, and robustly.
     */
        List<String> lines = read(filename);

    /* TODO Iterate over the lines read from the file, processing each line.
            Processing might mean: skipping blank lines
                                   splitting a line on its first tab
            Follow the guide for the basic line format.
     */
         List<String> data = new ArrayList<>();
         for (String line : lines)
         {
            if(!line.isBlank() || !line.isEmpty())
            {
               data.add(line);
            };
         }
         String name = data.get(0).split("\t")[1];
         String course = data.get(1).split("\t")[1];
         String start = data.get(2).split("\t")[1];
         String end = data.get(3).split("\t")[1];
         String hours = data.get(4).split("\t")[1];
         String comment = "";
         if (lines.size() > 6) {
            for (int i = 6; i < lines.size(); i++)
            {
               if (!lines.get(i).isBlank() || !lines.get(i).isEmpty())
               {
                  if (comment.isEmpty()) {
                     comment = lines.get(i);
                  }
                  else
                  {
                     comment = comment + ", " + lines.get(i);
                  }
               }
            }
         }
         Task nameTask = new Task("name", name);
         Task courseTask = new Task("name", course);
         Task startTask = new Task("start", start);
         Task endTask = new Task("end", end);
         Task hoursTask = new Task("hours", hours);
        /* Note the declaration of processedLines:
            "apparent" type on the left (the way the structure appears to the
                                         calling code)
            "actual" type on the right: so you can change the implementation
                                        without changing any of the calling code.
            The apparent type is more generic than the actual type.
         */
        List<Task> processedLines = new ArrayList<>();
        processedLines.add(nameTask);
        processedLines.add(courseTask);
        processedLines.add(startTask);
        processedLines.add(endTask);
        processedLines.add(hoursTask);
        if (!comment.isEmpty()) {
         Task commentTask = new Task("comment", comment);
         processedLines.add(commentTask);  
         }
        return processedLines;
        /* In case you are wondering, it is safe to return processedLines
           because it is a local variable not a field. Each time this method
           is called a new version of processedLines is created.
         */
    }
}

class Task
{
   private final String data;
   private final String content;

   public Task(String data, String content)
   {
      this.data = data;
      this.content = content;
   }
   public String getContent() {
       return content;
   }
   public String getData() {
       return data;
   }
}