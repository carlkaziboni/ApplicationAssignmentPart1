package todo03_read_config;

public class ProgramInvokingFileReading {
    public static void main(String[] args) {
        /* TODO A series of well-behaved `.tsv` files are provided for testing.
                These are in the `input` directory. You can right-click a
                TSV file in the `Project view` (`Alt+1`) and use
                `Copy Path/Reference...` to copy the `Path from Content Root`
                to the clipboard, then paste that into the program arguments
                for this class's `run configuration`.
                You can create your own files and practice using composition
                by reading multiple files, perhaps where a later files overrides
                the same setting(s) from an earlier file.
         */

        /* TODO Iterate over the category-line arguments,
                treating each as a file to be read by BasicReadFile.
         */
        /* Tip: The IntelliJ shortcuts `iter` and `itar` iterate over arrays:
                the one with the 'e' gives you an *e*nhanced `for` loop,
                the other gives you an indexed `for` loop
         */

        /* TODO First test reading works correctly
                BasicReadFile.read();
         */
        // TODO Then test processing lines works correctly

        /* TODO If you wish, you may put the testing inside
                the BasicReadFile class
                Or you may create separate JUnit tests
                (the course covers test-driven development)
         */

        /* TODO Once you are satisfied your code is reading these files
                properly, create some new files that are trickier
                such as having blank lines, multiple tab characters,
                or rogue spaces at the start of a line.
                You don't want your program to be defeated by a bit of
                whitespace.
         */
    }
}
