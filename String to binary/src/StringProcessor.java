import java.util.Arrays;

public class StringProcessor {
    public static void main(String[] args) {
        String input = " I love you ";
        int ascii [] = ASCIIProcessor.getInstance(input).toAscii();
        int binary[] = BinaryProcessor.getInstance(ascii).toBinary();

        System.out.println("Plain text\n"+input+"\n");
        System.out.println("Text to ASCII\n"+Arrays.toString(ascii)+"\n");
        System.out.println("ASCII to BINARY\n"+Arrays.toString(binary)+"\n");
    }
}
