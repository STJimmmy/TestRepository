public class FizzBuzz {
    private String Test;
    private Integer integer;

    public FizzBuzz(String test, Integer integer) {
        Test = test;
        this.integer = integer;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
