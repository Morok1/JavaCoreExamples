import java.lang.reflect.Method;

public class ListMethod {
    protected void info() {
        }

    public static void testMethod() {

    }

    public static void main(String[] args) {
        Method[] methods = ListMethod.class.getMethods();
        for (Method method:methods) {
            System.out.println(method.toString());
        }

    }
}
