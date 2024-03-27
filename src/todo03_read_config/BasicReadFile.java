package todo03_read_config;

import java.util.ArrayList;
import java.util.List;

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
        return lines;
        /* This method just calls a library method so it might seem
           superfluous: the code calling this method could have just
           called the library method directly. Think about why having this
           extra step reduces the knowledge required by whoever is writing
           the calling code, while increasing the flexibility should a
           different way of reading a file become necessary in future.
         */
    }

    public static List<String> getProcessedFileLines(String filename) {
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
    /* TODO Iterate over the lines read from the file, processing each line.
            Processing might mean: skipping blank lines
                                   splitting a line on its first tab
            Follow the guide for the basic line format.
     */

        /* Note the declaration of processedLines:
            "apparent" type on the left (the way the structure appears to the
                                         calling code)
            "actual" type on the right: so you can change the implementation
                                        without changing any of the calling code.
            The apparent type is more generic than the actual type.
         */
        List<String> processedLines = new ArrayList<>();
        return processedLines;
        /* In case you are wondering, it is safe to return processedLines
           because it is a local variable not a field. Each time this method
           is called a new version of processedLines is created.
         */
    }
}
