import java.lang.reflect.Modifier;

public final class ShowClassInfo {
    public static void main(String[] args) {
        Class<ShowClassInfo> aClass = ShowClassInfo.class;
        System.out.println(aClass.getName());

        int modifiers  = aClass.getModifiers();

        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isVolatile(modifiers));
        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isAbstract(modifiers));

        Class<Cat> catClass = Cat.class;
        System.out.println(catClass.getClassLoader());
        System.out.println(catClass.getGenericInterfaces());
        System.out.println(catClass.getSuperclass());
    }
}
