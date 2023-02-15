public class Q1_Flow {
    public void checkNegativeNo(int no) throws Q1_Exception {
        if (no<0) {
            throw new Q1_Exception();
        } else {
            System.out.println("Test 1 passed");
        }
    }
    public void CheckPositiveNo(int no) throws Q1_Exception {
        if (no>0) {
            throw new Q1_Exception();
        } else {
            System.out.println("Test 1 passed");
        }
    }
    public void CheckZero(int no)  throws Q1_Exception{
        if (no==0) {
            throw new Q1_Exception();
        } else {
            System.out.println("Test 1 passed");
        }
    }
}
