import java.util.StringTokenizer;
public class Q1_IP_SToken {
    public static void IP_SToken(String IP2) {
        StringTokenizer octets = new StringTokenizer(IP2,"\\.");
        System.out.println("HELLO FROM STRING TOKENIZER");
        while (octets.hasMoreTokens()) {
            System.out.println(octets.nextToken("\\."));
        }
    }
}
