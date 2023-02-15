public class Q1 {
    public static void main(String[] args) {
        Q1_Flow flow = new Q1_Flow();
        try {
            flow.checkNegativeNo(10);
            flow.checkNegativeNo(-10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            flow.CheckPositiveNo(-10);
            flow.CheckPositiveNo(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            flow.CheckZero(10);
            flow.CheckZero(0);
        } catch (Exception e) {
            e.printStackTrace();
        }           

    }
}
