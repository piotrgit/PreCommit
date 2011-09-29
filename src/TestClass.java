/**
 * Created by IntelliJ IDEA.
 * User: pmaruszak
 * Date: 1/24/11
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {
    private  int value = 0;
    private int tmp = 123;


    public TestClass() {
    }

   

    public void setValue(int value) {
        value++;
        this.value = value;
        this.value += 16;

    }
}
