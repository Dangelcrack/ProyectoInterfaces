package test;

public class test {
    private int  test;

    public test(int test) {
        this.test = test;
    }
    public  test(){

    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "test{" +
                "test=" + test +
                '}';
    }
}
