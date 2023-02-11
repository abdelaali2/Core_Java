public class Q1_IPCutter {
    public static void IPCutter (String IP1){
        String [] octets=IP1.split("\\.");
        for (int i = 0; i < octets.length; i++) {
            System.out.println(octets[i]);
        }
    }
}
