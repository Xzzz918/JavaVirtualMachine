package polymorphic;

/**
 * @author gemini
 * Created in  2021/4/15 20:07
 */
public class StaticDispatch {
    static abstract class Human{}

    static class Man extends Human{}

    static class Woman extends Human{}

    public void sayHello(Human guy){
        System.out.println("Hello, guy!");
    }

    public void sayHello(Man guy){
        System.out.println("Hello, gentleman!");
    }

    public void sayHello(Woman guy){
        System.out.println("Hello, lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sd = new StaticDispatch();
        sd.sayHello(man);
        sd.sayHello(woman);
    }
}
/*outputs:
Hello, guy!
Hello, guy!
* */
